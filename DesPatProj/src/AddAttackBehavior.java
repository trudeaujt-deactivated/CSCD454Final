
public class AddAttackBehavior implements Command 
{
	AttackBehavior behave;
	Character character;
	
	
	public AddAttackBehavior(AttackBehavior behavior, Character being)
	{
		
		this.behave = behavior;
		this.character = being;
	}
	
	@Override
	public void execute() 
	{

			character.setAttackStyle(this.behave);
			System.out.println("Command WORKS!");
	}

}
