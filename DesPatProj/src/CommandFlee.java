
public class CommandFlee extends Command2 
{
	private Direction direction;
	
//	public CommandFlee(Direction fleeDirection)
//	{
//		this.direction = fleeDirection;
//	}
	public CommandFlee()
	{
		
	}
	
	@Override
	public void execute() 
	{
		
		
		
		int hp = -4;
		
		System.out.println("Flee Behavior called was...");  //call the hero's flee behavior to calculate
		
		//for each member in party;
		// member.hitPoints += hp;
		
		System.out.println("Based on your flee, you lost");
		System.out.println("So each player lost" + hp + "points as you fled.");
		System.out.println("Command DOES NOT WORK.  CHECK THE CommandFlee.execute() file to fix!");
		System.out.println("call each member and subtract some hitPoints!");

		
	}


	
	
}
