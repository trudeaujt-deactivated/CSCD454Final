
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
	public Race createRace(String name) 
	{

		return new RaceType(name);
	}

	
	
	@Override
	public String toString() {
		return "WeakFactory";
	}
	@Override
	public AttackBehavior createAttackBehavior(){
		return new AttackHalfAss();
	}



	@Override
	public DefenseBehavior createDefenseBehavior() {
		return new DefenseEyesClosed();
	}



	@Override
	public FleeBehavior createFleeBehavior() {
		return new FleeTurnTail();
	}

}
