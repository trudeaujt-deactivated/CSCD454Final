
public class AddInventory implements Command 
{
	private Item item;
	private Character player;
	
	public AddInventory(Item pickedUpItem, Character character)
	{
		this.player = character;
		this.item = pickedUpItem;
	}
	
	@Override
	public void execute() 
	{
		System.out.println(this.player +" has added" + this.item + "to their inventory.");
		player.inventory.add(this.item);
		
		
		System.out.println("Command DOES NOT WORK.  CHECK THE AddInventory.execute() file to fix!");
		System.out.println("Need to pass in an item to check.");

	}
	
	//Display items in the room
	//ask which character to pickup
	//addedInventoryItem = new AddInventory(item,character)
	
	//controller.setCommand(addInventoryItem);
	//controller.sendCommand();

}
