/************************************************************
------------------- DecoratedPizza --------------------------
an abstract class to deal with the toppings and           ***
the combinations                                          ***
Size : small:5.99$,medium:7.99$,larage:9.99$              ***
Type : thin:00.0$,hand:0.5$,deep:1.00$                    ***
************************************************************/

package pizza;

abstract class DecoratedPizza
{
	private DecoratedPizza next_pizza_item; //store the next topping
	
	// the default constructor to set the next to null 
	//essentially a linked list set next to null
	public DecoratedPizza()
	{
		next_pizza_item = null;
	}
	
	//the construstor to set the next toppic 
	public DecoratedPizza(DecoratedPizza nextPizzaItem)
	{
		next_pizza_item = nextPizzaItem;
	}
	
	//get the cost from the "next_pizza_item" DecoratedPizza
	public double pizzaCost()
	{
		return next_pizza_item.pizzaCost();
	}
	
	//(override)get the state of the "next_pizza_item" DecoratedPizza
	public String toString()
	{
		return next_pizza_item.toString() + "\n";
	}
	
	// get the abbreviation of the "next_pizza_item" 
	// DecoratedPizza (the topping abbreviation is used
	// to obtain the correct pizza image)
	public String getImage()
	{
		if (next_pizza_item == null)
	    return "";
		return next_pizza_item.getImage();
	}
}