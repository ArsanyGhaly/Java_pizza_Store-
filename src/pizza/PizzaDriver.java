package pizza;

import util.Keyboard;
import java.text.DecimalFormat;

class PizzaDriver
{
	private static Keyboard kb;
	private static DecimalFormat df;
	
	private static int menu()
	{
		boolean validInput = false;
		int input = 0;
		
		while(!validInput)
		{
			System.out.println("\n1. Meat Lover's");
			System.out.println("2. Veggie Lover's");
			System.out.println("3. Hawaiian");
			System.out.println("4. Build Your Own");
			
			input = kb.readInt("\nSelect from the above: ");
			System.out.println(input);
			
			if (input >= 1 && input <= 4)
				validInput = true;
		}
		
		return input;
	}
	
	private static void requestSize(PizzaBuilder pizza_builder)
	{
		boolean validInput = false;
		
		while(!validInput)
		{
			String input = kb.readString("What size pizza (S/M/L)? ");
			System.out.println(input);
			
			if (input.length() == 1)
			{
				if (pizza_builder.setSize(input.charAt(0)))
					validInput = true;
			}
		}
	}
	
	private static void requestCrust(PizzaBuilder pizza_builder)
	{
		boolean validInput = false;
		
		while(!validInput)
		{
			String input = kb.readString("What type of crust (thin/hand/pan)? ");
			System.out.println(input);
			
			if (pizza_builder.setCrust(input))
				validInput = true;
		}
	}
	
	private static void requestToppings(PizzaBuilder pizza_builder)
	{
		boolean orderDone = false;
		
		while(!orderDone)
		{
			String input = kb.readString("(P)epperoni,(O)nions,(G)reen Peppers,(S)ausage,(M)ushrooms,(D)one\n");
			System.out.println(input);
			
			if (input.length() == 1)
			{
				char input_value = input.charAt(0);
				if (input_value == 'D' || input_value == 'd')
					orderDone = true;
				else
					pizza_builder.addTopping(input_value);
			}
		}
	}
	
	private static void showOrder(DecoratedPizza dec_pizza)
	{
		System.out.println("Your pizza:");
		System.out.println(dec_pizza.toString());
		double cost = dec_pizza.pizzaCost();
		System.out.println("\nThe cost of your pizza is $" + df.format(cost));
	}
	
	public static void main(String args[])
	{
		kb = Keyboard.getKeyboard();
		df = new DecimalFormat("0.00");
		
		boolean orderDone = false;
		
		while(!orderDone)
		{
			String input = kb.readString("Would you like to order a pizza (y/n)? ");
			System.out.println(input);
			
			if (input.compareTo("Y") == 0 || input.compareTo("y") == 0)
				orderDone = true;
			else if (input.compareTo("N") == 0 || input.compareTo("n") == 0)
				return;
		}
		
		orderDone = false;
		double total_cost = 0.0;
		int num_pizzas = 0;
		
		while(!orderDone)
		{
			PizzaBuilder pizza_builder = null;
			int pizza_type = menu();
			
			if (pizza_type == 1)
				pizza_builder = new MeatLovers();
			else if (pizza_type == 2)
				pizza_builder = new VeggieLovers();
			else if (pizza_type == 3)
				pizza_builder = new Hawaiian();
			else
				pizza_builder = new PizzaBuilder();
			
			requestSize(pizza_builder);
			requestCrust(pizza_builder);
			
			if (pizza_type == 4)
				requestToppings(pizza_builder);
			
			boolean validInput = false;
			boolean seniorDiscount = false;
			while(!validInput)
			{
				String input = kb.readString("\nAre you a senior citizen (y/n)? ");
				System.out.println(input);
				
				if (input.compareTo("Y") == 0 || input.compareTo("y") == 0)
				{
					validInput = true;
					seniorDiscount = true;
				}	
				else if (input.compareTo("N") == 0 || input.compareTo("n") == 0)
					validInput = true;
			}
			
			if (seniorDiscount)
				pizza_builder.addDiscount("senior discount", 0.10, true);
			
			validInput = false;
			boolean deliveryFee = false;
			while(!validInput)
			{
				String input = kb.readString("Do you need this pizza delivered (y/n)? ");
				System.out.println(input);
				
				if (input.compareTo("Y") == 0 || input.compareTo("y") == 0)
				{
					validInput = true;
					deliveryFee = true;
				}	
				else if (input.compareTo("N") == 0 || input.compareTo("n") == 0)
					validInput = true;
			}
			
			if (deliveryFee)
				pizza_builder.addDiscount("delivery", 2.50, false);
			
			DecoratedPizza finished_pizza = pizza_builder.pizzaDone();
			showOrder(finished_pizza);
			
			validInput = false;
			while(!validInput)
			{
				String input = kb.readString("\nWould you like to order another pizza (y/n)? ");
				System.out.println(input);
				
				if (input.compareTo("Y") == 0 || input.compareTo("y") == 0)
					validInput = true;
				else if (input.compareTo("N") == 0 || input.compareTo("n") == 0)
				{
					validInput = true;
					orderDone = true;
				}
			}

			total_cost += finished_pizza.pizzaCost();
			num_pizzas++;
		}
		
		System.out.println("\nYou ordered " + num_pizzas + " pizza(s) for a grand total of $" + df.format(total_cost) + ".");
	}
}