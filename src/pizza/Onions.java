package pizza;

class Onions extends DecoratedPizza
{
	public Onions(DecoratedPizza decorated_pizza)
	{
		super(decorated_pizza);
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + 0.79;
	}
	
	public String toString()
	{
		return super.toString() + "Onions";
	}
	
	public String getImage()
	{
		return super.getImage() + "O";
	}
}