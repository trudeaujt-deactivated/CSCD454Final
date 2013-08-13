
public class LeftoverItem extends Item implements Leftovers 
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
