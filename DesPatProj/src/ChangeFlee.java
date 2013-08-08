
public class ChangeFlee implements Command 
{
	FleeBehavior behave;
	Character character;
	
	
	public ChangeFlee(FleeBehavior behavior, Character being)
	{
		this.behave = behavior;
		this.character = being;
	}
	
	@Override
	public void execute() 
	{

			character.setFleeStyle(this.behave);
	}

}
