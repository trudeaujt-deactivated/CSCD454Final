import java.util.HashMap;


public class CommandCenter2 {
	
	HashMap<String, Command2> commandMap;
	
	public CommandCenter2(){
		commandMap = new HashMap<String, Command2>();
		
		commandMap.put("attack", new AttackCommand());
		commandMap.put("move north", new MoveNorth());
		commandMap.put("move south", new MoveSouth());
		commandMap.put("move east", new MoveEast());
		commandMap.put("move west",	 new MoveWest());
	}
	
	public Command2 getCommand(String userString){
		
		userString = userString.toLowerCase();
		
		return commandMap.containsKey(userString)? 
				commandMap.get(userString): new NullCommand();
	}


	public void executeCommand(String userString){
		getCommand(userString).execute();
	}

}
