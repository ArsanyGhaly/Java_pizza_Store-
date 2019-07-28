package pizza;

class Pizza extends DecoratedPizza
{
	private Crust crust;
	
	public Pizza(CrustSize crust_size, CrustType crust_type)
	{
		super();
		crust = new Crust(crust_size, crust_type);
	}
	
	public double pizzaCost()
	{
		return crust.crustCost();
	}
	
	public String toString()
	{
		return crust.toString() + "\nToppings:";
	}
	
	public String getImage()
	{
		return Character.toString(crust.getSize());
	}
}