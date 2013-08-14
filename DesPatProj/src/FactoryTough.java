
public class FactoryTough implements CharacterGenerator {

	@Override
	public Health createHealth() 
	{

		return new HealthTough();
	}

	
	
	@Override
	public Level createLevel() 
	{

		return new LevelTough();
	}

	
	
	@Override
	public String toString() {
		return "ToughFactory";
	}
	
	
	@Override
	public Name createName() 
	{

		return new NameTough();
	}

	
	
	@Override
	public Race createRace(String name) 
	{

		return new RaceType(name);
	}

	@Override
	public AttackBehavior createAttackBehavior(){
		return new AttackAggressive();
	}



	@Override
	public DefenseBehavior createDefenseBehavior() {
		return new DefenseWell();
	}



	@Override
	public FleeBehavior createFleeBehavior() {
		return new FleeBackOutFighting();
	}

}
