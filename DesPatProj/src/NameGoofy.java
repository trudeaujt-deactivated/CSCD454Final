
public class NameGoofy implements Name
{
	private String name = "";
	
	@Override
	public String createName() 
	{
		this.name = "Dork";
		
		return this.name;
	}

	public String toString()
	{
		
		return this.name;
	}
}
