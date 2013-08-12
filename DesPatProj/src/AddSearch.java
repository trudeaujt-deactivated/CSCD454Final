
public class AddSearch implements Command 
{
		
	public AddSearch(Character deadGuy)
	{
		//display deadGuy.inventory 

	}

	
//	public AddSearch(getRoomOverview(), getDeadGuysList(), getRoomItems())
//	{
//		
		//display roomDescription()
		//display deadGuysInRoom()
		//display roomItems() --->"You see.... sword, key, coin, etc.
	
//	}
	
	
	@Override
	public void execute() 
	{
		System.out.println("Calling instance of \ndisplayRoomOverview(), \ndisplayDeadGuys(), \ndisplayRoomItems()");
		System.out.println("Command DOES NOT WORK.  CHECK THE AddSearch.execute() file to fix!");
	}

}


//display the room description
//display a list items visible in room
	
//search a character for items
//getCharactersList() includes deadCharacters
//get Dead Characters' Items list from a dead character

//search = new AddSearch(generalDescriptionofRoom,deadCharactersList,roomItemsList)
					
//controller.setCommand(search);
//controller.sendCommand();