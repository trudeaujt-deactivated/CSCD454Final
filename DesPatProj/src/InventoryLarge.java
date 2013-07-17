
public class InventoryLarge implements InventorySize 
{
	final int size = 6;
	
	@Override
	public int createSize() 
	{

		return size;
	}

	public String toString()
	{
		
		return "6";
	}
	
}
