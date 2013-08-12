
public class AddFleeBehavior implements Command 
{
	FleeBehavior behave;
	Character character;
	
	
	public AddFleeBehavior(FleeBehavior behavior, Character being)
	{
		this.behave = behavior;
		this.character = being;
	}
	
	@Override
	public void execute() 
	{

			character.setFleeStyle(this.behave);
			System.out.println("Command WORKS!");
	}

}
