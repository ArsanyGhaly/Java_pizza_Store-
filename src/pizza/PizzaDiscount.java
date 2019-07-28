package pizza;

class PizzaDiscount extends DecoratedPizza
{
	private double discount_percentage;
	private String message;
	
	public PizzaDiscount(DecoratedPizza pizza_component, String msg, double discount)
	{
		super(pizza_component);
		discount_percentage = discount;
		message = msg;
	}
	
	public double pizzaCost()
	{
		double pizza_cost = super.pizzaCost();
		double discount = discount_percentage * pizza_cost;
		pizza_cost -= discount;
		
		return pizza_cost;
	}
	
	public String toString()
	{
		return super.toString() + message;
	}
	
	public String getImage()
	{
		return super.getImage();
	}
}