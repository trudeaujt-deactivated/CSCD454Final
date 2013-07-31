
public class FactoryWeak implements CharacterGenerator 
{

	@Override
	public Health createHealth() 
	{

		return new HealthWeak();
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

		return null;
	}
	
	
	@Override
	public String toString() {
		return "WeakFactory";
	}
	@Override
	public AttackBehavior createAttackBehavior(){
		return new HalfAssAttack();
	}

}
