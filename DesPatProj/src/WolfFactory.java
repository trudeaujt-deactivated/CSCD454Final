
public class WolfFactory implements CharacterFactory 
{

	@Override
	public String createName() 
	{

		return new NameGoofy().toString();
	}

	@Override
	public String createRace() 
	{

		return new RaceWolf().toString();
	}

	@Override
	public int createHealth() 
	{

		return Integer.parseInt(new HealthPoor().toString());
	}

	@Override
	public int createLevel() 
	{

		return	Integer.parseInt(new LevelDown().toString());
	}



	@Override
	public int createSize() 
	{
		return Integer.parseInt(new InventorySmall().toString());
	}


}
