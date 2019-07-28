package pizza;

class VeggieLovers extends PizzaBuilder
{
	protected void buildPizza()
	{
		pizza = new Pizza(crust_size, crust_type);
		super.addTopping('O');
		super.addTopping('G');
		super.addTopping('M');
	}
}