import java.util.HashMap;


public class CommandCenter {
	
	HashMap<String, Command> commandMap;
	Command nullCommand;
	public CommandCenter(Game game){
		commandMap = new HashMap<String, Command>();

		
		nullCommand = new NullCommand(game);
	
		
		//=================================================
		
	
	
	commandMap.put("attack", new CommandAttack(game));
	commandMap.put("move north", new CommandMoveNorth(game));
	commandMap.put("move south", new CommandMoveSouth(game));
	commandMap.put("move east", new CommandMoveEast(game));
	commandMap.put("move west",	 new CommandMoveWest(game));
	commandMap.put("change defense", new CommandDefenseBehavior(game));
	commandMap.put("change attack", new CommandAttackBehavior(game));
	commandMap.put("change flee", new CommandFleeBehavior(game));
	commandMap.put("change weapon", new CommandChangeWeapon(game));

	commandMap.put("flee north", new CommandMoveNorth(game));
	commandMap.put("flee south", new CommandMoveSouth(game));
	commandMap.put("flee east", new CommandMoveEast(game));
	commandMap.put("flee west", new CommandMoveWest(game));

	commandMap.put("move north",new CommandMoveNorth(game));
	commandMap.put("move south",new CommandMoveSouth(game));
	commandMap.put("move east",new CommandMoveEast(game));
	commandMap.put("move west",new CommandMoveWest(game));

	commandMap.put("join", new CommandJoin(game));
	commandMap.put("search room", new CommandSearch(game));
	//commandMap.put("pickup", new CommandAddInventory(game));
	commandMap.put("give", new CommandGiveItem(game));
	commandMap.put("help",new DisplayHelp(game));
		
	}
		
		
		
		
		
		
		
		
	
	  //=================================================

	private Command getCommand(String userString){
		
		userString = userString.toLowerCase();
		
		return commandMap.containsKey(userString)? 
				commandMap.get(userString): nullCommand;
	}

	public void executeCommand(String userString){
		getCommand(userString).execute();
	}

}
