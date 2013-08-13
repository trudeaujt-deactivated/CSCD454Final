
public class CommandFleeBehavior extends Command2
{
//	FleeBehavior behave;
//	Character character;
	
	private Game game;
//	public CommandFleeBehavior(FleeBehavior behavior, Character being)
//	{
//		this.behave = behavior;
//		this.character = being;
//	}
//	
	
	public CommandFleeBehavior(Game game)
	{
		this.game = game;
		commandString = "change flee";
	}
	@Override
	public void execute() 
	{

	//		character.setFleeStyle(this.behave);
			game.setWindowText("Command does not work need to chooseMember() and chooseBehavior()!");
	}

}
