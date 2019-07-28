package pizza;

class Pineapple extends DecoratedPizza
{
	public Pineapple(DecoratedPizza decorated_pizza)
	{
		super(decorated_pizza);
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + 0.89;
	}
	
	public String toString()
	{
		return super.toString() + "Pineapple";
	}
	
	public String getImage()
	{
		return super.getImage() + "A";
	}
}