public class NameHero implements Name 
{
	private String name;
		
	
	public NameHero()
	{
		
		this.name = "Dr.Cleveland";
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


	@Override
	public String randomGenerator(String[] items) {
		// TODO Auto-generated method stub
		return null;
	}

}
