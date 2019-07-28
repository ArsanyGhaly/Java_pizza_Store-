package pizza;

class Pepperoni extends DecoratedPizza
{
	public Pepperoni(DecoratedPizza decorated_pizza)
	{
		super(decorated_pizza);
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + 0.99;
	}
	
	public String toString()
	{
		return super.toString() + "Pepperoni";
	}
	
	public String getImage()
	{
		return super.getImage() + "P";
	}
}