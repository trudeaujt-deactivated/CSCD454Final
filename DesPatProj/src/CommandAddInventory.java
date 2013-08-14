
public class CommandAddInventory extends Command
{
	private GameControllerInterface controller;
	
	public CommandAddInventory(GameControllerInterface gci)
	{
		this.controller = gci;
		commandString = "pickup";
	}
	
	@Override
	public void execute() 
	{
		//here is your access variable....controller.getParty()
		
		
	//	controller.addInventory();
		
		
		//	System.out.println(this.player +" has added" + this.item + "to their inventory.");
	//	player.inventory.add(this.item);
		
		
		controller.setWindowText("Command DOES NOT WORK.  CHECK THE CommandAddInventory.execute() file to fix!");
		controller.setWindowText("Need to call displayRoomItems(), to select item,"+
		 "chooseMember() to select which player CommandAddInventory().");
	}
	
	//Display items in the room
	//ask which character to pickup
	//addedInventoryItem = new AddInventory(item,character)
	
	//controller.setCommand(addInventoryItem);
	//controller.sendCommand();

}
