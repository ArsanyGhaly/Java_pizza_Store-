package pizza;

class GreenPeppers extends DecoratedPizza
{
	public GreenPeppers(DecoratedPizza decorated_pizza)
	{
		super(decorated_pizza);
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + 0.69;
	}
	
	public String toString()
	{
		return super.toString() + "Green Peppers";
	}
	
	public String getImage()
	{
		return super.getImage() + "G";
	}
}