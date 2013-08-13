
public class AttackCommand extends Command2 {
	
	
	public AttackCommand(Game game){
		this.game = game;
		commandString = "attack";
	}
	@Override
	public void execute() {
		
		game.setWindowText("Attacking whatever I can find");
		/*Your same code here*/
		
	}

}
