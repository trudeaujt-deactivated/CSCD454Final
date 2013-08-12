
public class AddMove implements Command 
{
	Direction direction;

	
	public AddMove(Direction newDirection)
	{
		this.direction = newDirection;
	}
	
	@Override
	public void execute() 
	{
		System.out.println("You have moved "+direction);
		System.out.println("Command DOES NOT WORK.  CHECK THE AddMove.execute() file to fix!");

	}
	
	//prompt for a direction  
	
	//direction = chooseDirection();  request NORTH,SOUTH,EAST,WEST
	//ChangeDirection changeDirection = new AddMove(direction)

	
	

}
