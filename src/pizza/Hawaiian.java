package pizza;

class Hawaiian extends PizzaBuilder
{
	protected void buildPizza()
	{
		pizza = new Pizza(crust_size, crust_type);
		super.addTopping('H');
		super.addTopping('A');
	}
}