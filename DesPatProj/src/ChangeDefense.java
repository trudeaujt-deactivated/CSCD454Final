
public class ChangeDefense implements Command 
{
	DefenseBehavior behave;
	Character character;
	
	
	public ChangeDefense(DefenseBehavior behavior, Character being)
	{
		this.behave = behavior;
		this.character = being;
	}
	
	@Override
	public void execute() 
	{

			character.setDefendStyle(this.behave);
	}

}
