
public class NameGoofy implements Name
{
	private String name = "Dork";


	public NameGoofy()
	{
		this.name = "Dork";
	}
	
	@Override
	public String createName() 
	{
	
		return this.name;
	}
	
	
	public String toString()
	{
		
		return ("" + name);
	}

}
