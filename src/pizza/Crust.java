/************************************************************
------------------- Pizza Crust -----------------------------
set the size and and the type and return them             ***
Size : small:5.99$,medium:7.99$,larage:9.99$              ***
Type : thin:00.0$,hand:0.5$,deep:1.00$                    ***
************************************************************/
package pizza;

class Crust
{
	private CrustSize crust_size;
	private CrustType crust_type;
	
	//constructor to set the size and the type 
	public Crust(CrustSize crust_size, CrustType crust_type)
	{
		this.crust_size = crust_size;
		this.crust_type = crust_type;
	}
	
	//to retuen the cost depend on the size and type
	public double crustCost()
	{
		double cost = crust_size.getCost() + crust_type.getCost();
		return cost;
	}
	
	//get the type (thin-pan-hand)
	public String getCrust()
	{
		String type;
		if (crust_type == CrustType.THIN)
			type = "THIN";
		else if (crust_type == CrustType.HAND)
			type = "HAND";
		else
			type = "PAN";
		
		return type;
	}

	//get the size s, m ,l
	public char getSize()
	{
		char size;
		if (crust_size == CrustSize.S)
			size = 'S';
		else if (crust_size == CrustSize.M)
			size = 'M';
		else
			size = 'L';
		
		return size;
	}
	
    //to string to report the state 	
	public String toString()
	{
		String size = "Size: ";
		
		if (crust_size == CrustSize.S)
			size += "S";
		
		else if (crust_size == CrustSize.M)
			size += "M";
		
		else
			size += "L";
		
		String type = "Crust: ";
		
		if (crust_type == CrustType.THIN)
			type += "THIN";
		
		else if (crust_type == CrustType.HAND)
			type += "HAND";
		
		else
			type += "PAN";
		
		return size + "\n" + type;
	}
}