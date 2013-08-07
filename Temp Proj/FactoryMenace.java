
public class FactoryMenace implements CharacterGenerator
{
	
	@Override
	public Health createHealth() 
	{
		
		return new HealthAverage();
	}

	@Override
	public Level createLevel() 
	{
		
		
		return  new LevelTough();
	}

	@Override
	public Name createName() 
	{

		return new NameAverage();
	}


	@Override
	public Race createRace() 
	{

		return new RaceMenace();
	}

	@Override
	public Leftovers createLeftOvers() 
	{

		return new LeftoverItem();
	}

	@Override
	public String toString() 
	{
		return "MenaceFactory"; 
	}

	
	
}
