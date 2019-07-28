package pizza;

class Mushrooms extends DecoratedPizza
{
	public Mushrooms(DecoratedPizza decorated_pizza)
	{
		super(decorated_pizza);
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + 0.79;
	}
	
	public String toString()
	{
		return super.toString() + "Mushrooms";
	}
	
	public String getImage()
	{
		return super.getImage() + "M";
	}
}