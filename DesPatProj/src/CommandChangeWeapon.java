
public class CommandChangeWeapon extends Command 
{
	//CommandCenter2 command;
	
	public CommandChangeWeapon(GameControllerInterface gci)
	{
		controller = gci;
		commandString = "change weapon";
	}
	@Override
	public void execute() 
	{

		controller.setWindowText("change weapon not fixed, go to CommandChangeWeapon.execute()!");
	}

}
