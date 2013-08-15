
public class CommandAttackBehavior extends Command
{
//	AttackBehavior behave;
//	Character character;
//	
//	public CommandAttackBehavior(AttackBehavior behavior, Character being)
//	{
//		
//		this.behave = behavior;
//		this.character = being;
//	}
	public CommandAttackBehavior(GameControllerInterface gci)
	{
		controller = (GameController)gci;
	}
	
	@Override
	public void execute() 
	{
		//	character.setAttackStyle(this.behave);
			controller.setWindowText("Command does not work!");
			controller.setWindowText("Need to chooseMember() and chooseBehavior()");

	}

}
