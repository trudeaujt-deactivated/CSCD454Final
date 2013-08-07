
public class NameCool implements Name
{

	private String name = "";


	public NameCool()
	{
		this.name = "Stud-Muffin";
	}
	
	@Override
	public String createName() 
	{
	
		return this.name;
	}
	
	
	public String toString()
	{
		
		return this.name;
	}


}
