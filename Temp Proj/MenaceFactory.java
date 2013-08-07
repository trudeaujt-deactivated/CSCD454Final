
public class MenaceFactory implements CharacterFactory
{

	@Override
	public Health createHealth() 
	{
		return new HealthAverage();

	}

	@Override
	public Level createLevel() 
	{
		LevelHigh levelHi = new LevelHigh();
		return levelHi;
		
	}

	@Override
	public Name createName() 
	{

		return new NameCool();
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
	public String toString() {
		return "MenaceFactory"; 
	}

	
	
}
