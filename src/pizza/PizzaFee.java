package pizza;

class PizzaFee extends DecoratedPizza
{
	private double fee;
	private String message;
	
	public PizzaFee(DecoratedPizza pizza_component, String msg, double fee)
	{
		super(pizza_component);
		this.fee = fee;
		message = msg;
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + fee;
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