
public class CommandFleeBehavior extends Command
{
//	FleeBehavior behave;
//	Character character;
	
//	public CommandFleeBehavior(FleeBehavior behavior, Character being)
//	{
//		this.behave = behavior;
//		this.character = being;
//	}
//	
	
	public CommandFleeBehavior(GameControllerInterface gci)
	{
		controller = gci;
		commandString = "change flee";
	}
	@Override
	public void execute() 
	{
		
	//		character.setFleeStyle(this.behave);
			controller.setWindowText("Command does not work need to chooseMember() and chooseBehavior()!");
	}

}
