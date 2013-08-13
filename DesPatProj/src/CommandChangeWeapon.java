
public class CommandChangeWeapon extends Command2 
{
	//CommandCenter2 command;
	private Game game;
	
	public CommandChangeWeapon(Game game)
	{
		this.game = game;
		commandString = "change weapon";
	}
	@Override
	public void execute() 
	{

		game.setWindowText("change weapon not fixed, go to CommandChangeWeapon.execute()!");
	}

}
