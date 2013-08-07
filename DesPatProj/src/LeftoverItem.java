
public class LeftoverItem implements Leftovers, Item 
{

	@Override
	public Item createLeftovers() 
	{
		Item leftover = null;// = new Leftovers();
		return leftover;
	}
	
	public String toString()
	{
		return "list of items";
	}

}
