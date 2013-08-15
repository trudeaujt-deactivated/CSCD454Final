
public class CommandGiveItem extends Command 
{
//	Character giver;
//	Character receiver;
//	Item item;
	
//	public CommandGiveItem(Character from, Item item, Character to)
//	{
//		this.giver = from;
//		this.receiver = to;
//		this.item = item;
//	}
	
	public CommandGiveItem(GameControllerInterface gci)
	{
		controller = (GameController)gci;
		commandString = "give";
	}
	
	@Override
	public void execute() 
	{
	//	System.out.println(giver.toString() + " gave "+ this.item + " to"+ this.receiver);
	//	receiver.inventory.add(this.item);
	//	receiver.inventory.remove(this.item);
		
		controller.setWindowText("Command DOES NOT WORK.  CHECK THE CommandGiveItem.execute() file to fix!");
		controller.setWindowText("Call chooseMember(), chooseMember() member.displayInventory() selectItem()" +
		   "item.remove()  member.addItem(item)");

	}
	
	
	//select character that gives something to someone else
	//select character.inventory item()
	//select character to receive item
	
	//givenItem = new AddGivenItem(characterFrom,item, characterTo)

	//controller.setCommand(givenItem);
	//controller.sendCommand();
	

}
