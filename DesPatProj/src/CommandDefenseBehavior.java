
public class CommandDefenseBehavior extends Command2 
{
	private Game game;
	
	public CommandDefenseBehavior(Game game)
	{
		this.game = game;
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
		game.setWindowText("Command does NOT WORK!");

		//	character.setDefendStyle(this.behave);

		game.setWindowText("Need to chooseMember() and chooseDefense()");
	}

}
