
public class AddDefenseBehavior implements Command 
{
	DefenseBehavior behave;
	Character character;
	
	
	public AddDefenseBehavior(DefenseBehavior behavior, Character being)
	{
		this.behave = behavior;
		this.character = being;
	}
	
	@Override
	public void execute() 
	{

			character.setDefendStyle(this.behave);
			System.out.println("Command WORKS!");
	}

}
