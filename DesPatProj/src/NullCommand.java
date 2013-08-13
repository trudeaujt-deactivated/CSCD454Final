
public class NullCommand extends Command2 {
	
	public NullCommand(Game game){
		this.game = game;
		commandString = "no command";
		
	}
	
	@Override
	public void execute() {
		game.postWindowText("What was that?");
		
	}

}
