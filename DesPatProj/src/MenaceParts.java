
public class MenaceParts implements CharacterComponents
{
	@Override
	public String createName() 
	{

		return new NameGoofy().toString();
	}

	@Override
	public String createRace() 
	{

		return new RaceMenace().toString();
	}

	@Override
	public int createHealth() 
	{

		return Integer.parseInt(new HealthAverage().toString());
	}

	@Override
	public int createLevel() 
	{

		return	Integer.parseInt(new LevelLow().toString());
	}

}
