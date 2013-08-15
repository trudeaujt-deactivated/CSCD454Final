
public class CommandDefenseBehavior extends Command 
{
	
	public CommandDefenseBehavior(GameControllerInterface gci)
	{
		controller = (GameController)gci;
		commandString = "change defense";
		
	}
	
	
//	public CommandDefenseBehavior(DefenseBehavior behavior, Character being)
//	{
//		this.behave = behavior;
//		this.character = being;
//	}
	
	@Override
	public void execute() 
	{
		controller.setWindowText("Command does NOT WORK!");

		//	character.setDefendStyle(this.behave);

		controller.setWindowText("Need to chooseMember() and chooseDefense()");
	}

}
