package pizza;

class PizzaBuilder
{
	protected DecoratedPizza pizza;
	protected CrustSize crust_size;
	protected CrustType crust_type;
	
	public PizzaBuilder()
	{
		crust_size = null;
		crust_type = null;
		pizza = new Pizza(CrustSize.S, CrustType.THIN);
	}
	
	protected void buildPizza()
	{
		pizza = new Pizza(crust_size, crust_type);
	}
	
	public boolean setSize(char try_size)
	{
		boolean validSize = true;
		
		if (try_size == 's' || try_size == 'S')
			crust_size = CrustSize.S;
		else if (try_size == 'm' || try_size == 'M')
			crust_size = CrustSize.M;
		else if (try_size == 'l' || try_size == 'L')
			crust_size = CrustSize.L;
		else
			validSize = false;
		
		if (crust_size != null && crust_type != null)
			buildPizza();
		
		return validSize;
	}
	
	public boolean setCrust(String try_crust)
	{
		boolean validType = true;
		
		if (try_crust.compareTo("thin") == 0 || try_crust.compareTo("THIN") == 0)
			crust_type = CrustType.THIN;
		else if (try_crust.compareTo("hand") == 0 || try_crust.compareTo("HAND") == 0)
			crust_type = CrustType.HAND;
		else if (try_crust.compareTo("pan") == 0 || try_crust.compareTo("PAN") == 0)
			crust_type = CrustType.PAN;
		else
			validType = false;
		
		if (crust_size != null && crust_type != null)
			buildPizza();
		
		return validType;
	}
	
	public void addTopping(char topping_char)
	{
		// topping can only connect to a topping or pizza
		if (pizza instanceof PizzaTopping || pizza instanceof Pizza)
		{
			DecoratedPizza new_topping = null;
			if (topping_char == 'P' || topping_char == 'p')
				new_topping = PizzaToppingFactory .addPepperoni(pizza);
			else if (topping_char == 'S' || topping_char == 's')
				new_topping = PizzaToppingFactory .addSausage(pizza);
			else if (topping_char == 'O' || topping_char == 'o')
				new_topping = PizzaToppingFactory .addOnions(pizza);
			else if (topping_char == 'G' || topping_char == 'g')
				new_topping = PizzaToppingFactory .addGreenPeppers(pizza);
			else if (topping_char == 'M' || topping_char == 'm')
				new_topping = PizzaToppingFactory .addMushrooms(pizza);
			else if (topping_char == 'H' || topping_char == 'h')
				new_topping = PizzaToppingFactory .addHam(pizza);
			else if (topping_char == 'A' || topping_char == 'a')
				new_topping = PizzaToppingFactory .addPineapple(pizza);
			
			if (new_topping != null)
				pizza = new_topping;
		}
	}
	
	public void addDiscount(String msg, double discount, boolean isDiscount)
	{
		if (isDiscount)
		{
			// discount can only connect to a discount, topping, or pizza
			if (pizza instanceof PizzaDiscount || pizza instanceof PizzaTopping || pizza instanceof Pizza)
			{
				// checks to make sure discount is between 0.0 and 1.0
				if (discount >= 0.0 && discount <= 1.0)
					pizza = new PizzaDiscount(pizza, msg, discount);
			}
		}
		else
			pizza = new PizzaFee(pizza, msg, discount);
	}
	
	public DecoratedPizza pizzaDone()
	{
		DecoratedPizza finished_pizza = pizza;
		crust_size = null;
		crust_type = null;
		pizza = new Pizza(CrustSize.S, CrustType.THIN);
		
		return finished_pizza;
	}
}