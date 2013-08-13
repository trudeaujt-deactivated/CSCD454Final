
public class CommandAddInventory extends Command2
{
//	private Item item;
//	private Character player;
	
//	public CommandAddInventory(Item pickedUpItem, Character character)
//	{
//		this.player = character;
//		this.item = pickedUpItem;
//	}

	private Game game;
	
	public CommandAddInventory(Game game)
	{
		this.game = game;
		commandString = "pickup";
	}
	
	@Override
	public void execute() 
	{
	//	System.out.println(this.player +" has added" + this.item + "to their inventory.");
	//	player.inventory.add(this.item);
		
		
		game.setWindowText("Command DOES NOT WORK.  CHECK THE CommandAddInventory.execute() file to fix!");
		game.setWindowText("Need to call displayRoomItems(), to select item,"+
		 "chooseMember() to select which player CommandAddInventory().");
	}
	
	//Display items in the room
	//ask which character to pickup
	//addedInventoryItem = new AddInventory(item,character)
	
	//controller.setCommand(addInventoryItem);
	//controller.sendCommand();

}
