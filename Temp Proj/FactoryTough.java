
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
	public AttackBehavior createAttackBehavior(){
		return new AggressiveAttack();
	}



	@Override
	public DefenseBehavior createDefenseBehavior() {
		return new DefendWell();
	}



	@Override
	public FleeBehavior createFleeBehavior() {
		return new BackOutFightingFleeStyle();
	}

}