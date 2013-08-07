
public class RaceHero implements Race 
{
	private String type;
	

	public RaceHero(String name)
	{
		
		this.type = name;
	}
	
	@Override
	public String toString()
	{
		
		
		return type;
	}

	@Override
	public String createRace() 
	{


		return type;
	}
}
