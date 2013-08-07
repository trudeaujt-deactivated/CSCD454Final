
public class FactoryWolf implements CharacterGenerator 
{

	@Override
	public Health createHealth() 
	{
		
		return new HealthAverage();
	}

	
	
	@Override
	public Level createLevel() 
	{
		
		return new LevelWeak();
	}

	
	
	@Override
	public Name createName() 
	{
		
		return new NameWeak();
	}

	
	
	@Override
	public Race createRace() 
	{
		
		return new RaceType();
	}

	
	
	@Override
	public Leftovers createLeftOvers() 
	{
		
		return new LeftoverItem();
	}



	@Override
	public String toString() {
		return "WolfFactory"; 
	}
	
	

}
