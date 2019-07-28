package pizza;

class PizzaTopping extends DecoratedPizza
{
	private double topp_cost;
	private String topp_name;
	private String topp_letter;
	
	public PizzaTopping(DecoratedPizza pizza_component, String topping_string, String topping_letter, double topping_cost)
	{
		super(pizza_component);
		topp_cost = topping_cost;
		topp_name = topping_string;
		topp_letter = topping_letter;
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + topp_cost;
	}
	
	public String toString()
	{
		return super.toString() + topp_name;
	}
	
	public String getImage()
	{
		return super.getImage() + topp_letter;
	}
}