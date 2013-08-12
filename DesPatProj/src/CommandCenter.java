
public class CommandCenter 
{
	Command command;
	
	
	public CommandCenter() 
	{
		
		
	}
	
	
	public void setCommand(Command commandIn)
	{
		
		this.command = commandIn;
	}
	
	
	public void sendCommand()
	{
		
		command.execute();
	}
	
}
