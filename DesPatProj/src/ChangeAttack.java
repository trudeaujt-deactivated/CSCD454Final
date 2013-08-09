
public class ChangeAttack implements Command 
{
	AttackBehavior behave;
	Character character;
	
	
	public ChangeAttack(AttackBehavior behavior, Character being)
	{
		
		this.behave = behavior;
		this.character = being;
	}
	
	@Override
	public void execute() 
	{

			character.setAttackStyle(this.behave);
	}

}
