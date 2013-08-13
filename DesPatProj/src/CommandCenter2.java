import java.util.HashMap;


public class CommandCenter2 {
	
	HashMap<String, Command2> commandMap;
	Command2 nullCommand;
	public CommandCenter2(Game game){
		commandMap = new HashMap<String, Command2>();
		
		commandMap.put("attack", new AttackCommand(game));
		commandMap.put("move north", new MoveNorth(game));
		commandMap.put("move south", new MoveSouth(game));
		commandMap.put("move east", new MoveEast(game));
		commandMap.put("move west",	 new MoveWest(game));
		
		nullCommand = new NullCommand(game);
	}
	
	private Command2 getCommand(String userString){
		
		userString = userString.toLowerCase();
		
		return commandMap.containsKey(userString)? 
				commandMap.get(userString): nullCommand;
	}

	public void executeCommand(String userString){
		getCommand(userString).execute();
	}

}
