
public abstract class Command 
{
	protected String commandString;
	protected Game game;
	
	public abstract void execute();
	
	public String getCommand()
	{
		return commandString;
	}

}
