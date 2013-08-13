
public class CommandNull extends Command2 
{
	
	public CommandNull()
	{
	commandString = "no command";
	}
	
	@Override
	public void execute() 
	{
		System.out.println("Not a command, try again or type help");
		System.out.println("Probably works, returns a null command.");

	}

}
