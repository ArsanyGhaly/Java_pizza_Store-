package pizza;

class PizzaToppingFactory 
{
	private PizzaToppingFactory ()
	{
	}
	
	public static DecoratedPizza addPepperoni(DecoratedPizza dec_pizza)
	{
		PizzaTopping pizza_topping = new PizzaTopping(dec_pizza, "Pepperoni", "P", 0.99);
		return pizza_topping;
	}
	
	public static DecoratedPizza addSausage(DecoratedPizza dec_pizza)
	{
		PizzaTopping pizza_topping = new PizzaTopping(dec_pizza, "Sausage", "S", 0.99);
		return pizza_topping;
	}
	
	public static DecoratedPizza addOnions(DecoratedPizza dec_pizza)
	{
		PizzaTopping pizza_topping = new PizzaTopping(dec_pizza, "Onions", "O", 0.79);
		return pizza_topping;
	}
	
	public static DecoratedPizza addGreenPeppers(DecoratedPizza dec_pizza)
	{
		PizzaTopping pizza_topping = new PizzaTopping(dec_pizza, "Green Peppers", "G", 0.69);
		return pizza_topping;
	}
	
	public static DecoratedPizza addMushrooms(DecoratedPizza dec_pizza)
	{
		PizzaTopping pizza_topping = new PizzaTopping(dec_pizza, "Mushrooms", "M", 0.79);
		return pizza_topping;
	}
	
	public static DecoratedPizza addHam(DecoratedPizza dec_pizza)
	{
		PizzaTopping pizza_topping = new PizzaTopping(dec_pizza, "Ham", "H", 0.89);
		return pizza_topping;
	}
	
	public static DecoratedPizza addPineapple(DecoratedPizza dec_pizza)
	{
		PizzaTopping pizza_topping = new PizzaTopping(dec_pizza, "Pineapple", "A", 0.89);
		return pizza_topping;
	}
}