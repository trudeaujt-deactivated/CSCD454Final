
public class HeroFactory implements CharacterFactory 
{

	@Override
	public Health createHealth() 
	{

		return new HealthGood();
	}

	@Override
	public Level createLevel() 
	{

		return new LevelLow();
	}

	@Override
	public Name createName() 
	{

		return new NameCool();
	}

	@Override
	public Race createRace() 
	{

		return new RaceBlob();
	}

	@Override
	public Leftovers createLeftOvers() 
	{

		return new LeftoverItem();
	}

	@Override
	public String toString()
	{
		return "HeroFactory";
	}
}
