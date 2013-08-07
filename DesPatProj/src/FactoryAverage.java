import java.util.Random;


public class FactoryAverage implements CharacterGenerator 
{
	Random rand = new Random();
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
	public Race createRace(String name) 
	{

		return new RaceType(name);
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

		if(randomChoice() == 0)
			return new AggressiveAttack();
		return new HalfAssAttack();
	}
	
	@Override
	public DefenseBehavior createDefenseBehavior(){
		if(randomChoice() == 0)
			return new DefendWell();
		return new EyesClosedDefense();
	}
	
	@Override
	public FleeBehavior createFleeBehavior(){
		if(randomChoice() == 0)
			return new BackOutFightingFleeStyle();
		return new TurnTailFleeStyle();
	}
	
	public int randomChoice(){
		return Math.abs(rand.nextInt()%2);
		
	}

}
