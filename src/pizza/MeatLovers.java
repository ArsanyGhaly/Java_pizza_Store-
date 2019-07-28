package pizza;

class MeatLovers extends PizzaBuilder
{
	protected void buildPizza()
	{
		pizza = new Pizza(crust_size, crust_type);
		super.addTopping('P');
		super.addTopping('S');
		super.addTopping('H');
	}
}