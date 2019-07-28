package pizza;

class Sausage extends DecoratedPizza
{
	public Sausage(DecoratedPizza decorated_pizza)
	{
		super(decorated_pizza);
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + 0.99;
	}
	
	public String toString()
	{
		return super.toString() + "Sausage";
	}
	
	public String getImage()
	{
		return super.getImage() + "S";
	}
}