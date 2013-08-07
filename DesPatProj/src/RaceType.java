public class RaceType implements Race 
{
	private String raceName;
	
	
	public RaceType(String name)
	{
		
		this.raceName = name;
	}
	

	@Override
	public String createRace() 
	{

		return raceName;
	}

	@Override
	public String toString()
	{
		
		return this.raceName;
	}

}
