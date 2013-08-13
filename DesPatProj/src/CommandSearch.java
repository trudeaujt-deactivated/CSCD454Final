
public class CommandSearch extends Command2
{
		
	private Game game;
	
	public CommandSearch(Game game)
	{
		//display deadGuy.inventory 
		this.game = game;
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
		game.setWindowText("Calling instance of \ndisplayRoomOverview(), \ndisplayDeadGuys(), \ndisplayRoomItems()");
		game.setWindowText("Command DOES NOT WORK.  CHECK THE AddSearch.execute() file to fix!");
		game.setWindowText("Need to call displayRoomDescription(), displayCharactersInRoom(), displayRoomItems()");
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