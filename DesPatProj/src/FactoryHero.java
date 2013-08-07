
public class FactoryHero implements CharacterGenerator 
{

	@Override
	public Health createHealth() 
	{

		return new HealthTough();
	}

	
	@Override
	public Level createLevel() 
	{

		return new LevelWeak();
	}

	
	@Override
	public Name createName() 
	{
		
		return new NameHero();
	}

	
	@Override
	public Race createRace(String name) 
	{

		return new RaceHero(name);
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
