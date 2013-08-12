
public class AddFlee implements Command 
{
	private Direction direction;
	
	public AddFlee(Direction fleeDirection)
	{
		this.direction = fleeDirection;
	}
	
	@Override
	public void execute() 
	{
		int hp = -4;
		
		System.out.println("Flee Behavior called was...");  //call the hero's flee behavior to calculate
		
		//for each member in party;
		// member.hitPoints += hp;
		
		System.out.println("So each player lost" + hp + "points as you fled.");
		System.out.println("Command DOES NOT WORK.  CHECK THE AddFlee.execute() file to fix!");
		
		
	}


	
	
}
