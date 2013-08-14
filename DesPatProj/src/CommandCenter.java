import java.util.HashMap;


public class CommandCenter 
{
	
	HashMap<String, Command> commandMap;
	Command nullCommand;
	
	public CommandCenter(GameControllerInterface gci){
		
	commandMap = new HashMap<String, Command>();

	nullCommand = new CommandNull(gci);


	commandMap.put("attack", new CommandAttack(gci));

	commandMap.put("change defense", new CommandDefenseBehavior(gci));
	commandMap.put("change attack", new CommandAttackBehavior(gci));
	commandMap.put("change flee", new CommandFleeBehavior(gci));
	commandMap.put("change weapon", new CommandChangeWeapon(gci));

	commandMap.put("flee north", new CommandMoveNorth(gci));
	commandMap.put("flee south", new CommandMoveSouth(gci));
	commandMap.put("flee east", new CommandMoveEast(gci));
	commandMap.put("flee west", new CommandMoveWest(gci));

	commandMap.put("move north",new CommandMoveNorth(gci));
	commandMap.put("move south",new CommandMoveSouth(gci));
	commandMap.put("move east",new CommandMoveEast(gci));
	commandMap.put("move west",new CommandMoveWest(gci));

	commandMap.put("join", new CommandJoin(gci));
	commandMap.put("search room", new CommandSearch(gci));
	commandMap.put("pickup", new CommandAddInventory(gci));
	commandMap.put("give", new CommandGiveItem(gci));
	commandMap.put("help", new DisplayHelp(gci));
	
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
