
public class CommandAttack extends Command
{
	public CommandAttack(GameControllerInterface gci)
	{
		this.controller = gci;
		commandString = "attack";
	}

	
	@Override
	public void execute() 
	{
		
		controller.setWindowText("Attacking whatever I can find");
		controller.setWindowText("Calling instance of battle here or performing single attack.");
		controller.setWindowText("Command DOES NOT WORK.  CHECK THE CommandAttack.execute() file to fix!");
		/*Your same code here*/
		
	}
	
//	@Override
//	public void execute() 
//	{
//	//	battle.start();
//		
//		System.out.println("Calling instance of battle here or performing single attack.");
//		System.out.println("Command DOES NOT WORK.  CHECK THE CommandAttack.execute() file to fix!");

		//	battle.start();
		//  battle could also be single attack, ONE pass of iteration through each pair, for fight
		//  not necessary, but optional
		//  maybe for a single attack there could be a "firesBack() from the enemy, where each
		//  member would then perform a singleAttack(), everyone fights through each pair ONE time
		//  if a single attack is performed...
		
	}
	



