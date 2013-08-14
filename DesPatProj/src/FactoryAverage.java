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
	public String toString() {
		return "AverageFactory";
	}
	
	@Override
	public AttackBehavior createAttackBehavior(){

		if(randomChoice() == 0)
			return new AttackAggressive();
		return new AttackHalfAss();
	}
	
	@Override
	public DefenseBehavior createDefenseBehavior(){
		if(randomChoice() == 0)
			return new DefenseWell();
		return new DefenseEyesClosed();
	}
	
	@Override
	public FleeBehavior createFleeBehavior(){
		if(randomChoice() == 0)
			return new FleeBackOutFighting();
		return new FleeTurnTail();
	}
	
	public int randomChoice(){
		return Math.abs(rand.nextInt()%2);
		
	}

}
