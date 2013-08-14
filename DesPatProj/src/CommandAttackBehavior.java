
public class CommandAttackBehavior extends Command
{
//	AttackBehavior behave;
//	Character character;
//	
	private Game game;
//	public CommandAttackBehavior(AttackBehavior behavior, Character being)
//	{
//		
//		this.behave = behavior;
//		this.character = being;
//	}
	public CommandAttackBehavior(Game game)
	{
		this.game = game;
	}
	
	@Override
	public void execute() 
	{
		//	character.setAttackStyle(this.behave);
			game.setWindowText("Command does not work!");
			game.setWindowText("Need to chooseMember() and chooseBehavior()");

	}

}
