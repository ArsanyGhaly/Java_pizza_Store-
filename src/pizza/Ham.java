package pizza;

class Ham extends DecoratedPizza
{
	public Ham(DecoratedPizza decorated_pizza)
	{
		super(decorated_pizza);
	}
	
	public double pizzaCost()
	{
		return super.pizzaCost() + 0.89;
	}
	
	public String toString()
	{
		return super.toString() + "Ham";
	}
	
	public String getImage()
	{
		return super.getImage() + "H";
	}
}