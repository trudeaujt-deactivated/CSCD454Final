
public class InventorySmall implements InventorySize 
{
	final int size = 2;
	
	
	@Override
	public int createSize() 
	{

		return size;
	}

	
	public String toString()
	{
		
		return "2";
	}
	
}
