
public abstract class Command2 {
	
	protected String commandString;
	
	public abstract void execute();
	public String getCommand(){
		return commandString;
	}

}
