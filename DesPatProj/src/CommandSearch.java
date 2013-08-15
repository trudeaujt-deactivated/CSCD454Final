
public class CommandSearch extends Command
{
	
	public CommandSearch(GameControllerInterface gci)
	{
		//display deadGuy.inventory 
		controller = (GameController)gci;
		commandString = "search";
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
		controller.setWindowText("Calling instance of \ndisplayRoomOverview(), \ndisplayDeadGuys(), \ndisplayRoomItems()");
		controller.setWindowText("Command DOES NOT WORK.  CHECK THE AddSearch.execute() file to fix!");
		controller.setWindowText("Need to call displayRoomDescription(), displayCharactersInRoom(), displayRoomItems()");
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