import java.util.Random;


public class FactoryAverage implements CharacterGenerator 
{

	@Override
	public Health createHealth() 
	{

		return new HealthAverage();
	}

	
	
	@Override
	public Level createLevel() 
	{

		return new LevelAverage();
	}

	
	
	@Override
	public Name createName() 
	{

		return new NameAverage();
	}

	
	
	@Override
	public Race createRace() 
	{

		return new RaceType();
	}

	
	
	@Override
	public Leftovers createLeftOvers() 
	{

		return null;
	}



	@Override
	public String toString() {
		return "AverageFactory";
	}
	@Override
	public AttackBehavior createAttackBehavior(){
		Random rand = new Random();
		if(Math.abs(rand.nextInt()%2) == 0)
			return new AggressiveAttack();
		else 
			return new HalfAssAttack();
	}
	

}
