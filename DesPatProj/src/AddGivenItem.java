
public class AddGivenItem implements Command 
{
	Character giver;
	Character receiver;
	Item item;
	
	public AddGivenItem(Character from, Item item, Character to)
	{
		this.giver = from;
		this.receiver = to;
		this.item = item;
	}
	
	
	@Override
	public void execute() 
	{
		System.out.println(giver.toString() + " gave "+ this.item + " to"+ this.receiver);
	//	receiver.inventory.add(this.item);
	//	receiver.inventory.remove(this.item);
		
		System.out.println("Command DOES NOT WORK.  CHECK THE AddGivenItem.execute() file to fix!");
	}
	
	
	//select character that gives something to someone else
	//select character.inventory item()
	//select character to receive item
	
	//givenItem = new AddGivenItem(characterFrom,item, characterTo)

	//controller.setCommand(givenItem);
	//controller.sendCommand();
	

}
