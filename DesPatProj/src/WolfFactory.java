
public class WolfFactory implements CharacterFactory 
{

	@Override
	public Health createHealth() 
	{
		
		return new HealthPoor();
	}

	
	
	@Override
	public Level createLevel() 
	{
		
		return new LevelLow();
	}

	
	
	@Override
	public Name createName() 
	{
		
		return new NameGoofy();
	}

	
	
	@Override
	public Race createRace() 
	{
		
		return new RaceWolf();
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
