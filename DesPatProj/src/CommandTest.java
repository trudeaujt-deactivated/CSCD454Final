import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CommandTest
{
	
	public static void main(String[] args) 
	{
		CommandTest run = new CommandTest();
		
		ChangeAttack changeAttack;
		ChangeDefense changeDefense;
		ChangeFlee changeFlee;
		
		CommandCenter controller = new CommandCenter();
		Character character = new Wolf(new FactoryWeak(), "Wolf");   //create a wolf

		changeAttack = new ChangeAttack(new AttackAggressive(), character);  //define a new change
		changeDefense = new ChangeDefense(new DefenseWell(), character);
		changeFlee = new ChangeFlee(new FleeBackOutFighting(), character);

		
		
		System.out.println("Before change");

		System.out.println(character);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		
		controller.setCommand(changeAttack); //swap out attack;  
		controller.sendCommand(); // the set.Command encapsulates the change, doesn't care about command itself; just calls execute
		
		controller.setCommand(changeDefense);//swap out defense
		controller.sendCommand();
		
		controller.setCommand(changeFlee);//swap out flee
		controller.sendCommand();
		
		
		System.out.println("After change");

		System.out.println(character);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		run.commandInterpreter();

	}	

	
	
	public void commandInterpreter()
	{
		
		String input = null;
		boolean done = false;
		
		final int FIRSTWORD = 0;
		final int SECONDWORD = 1;
		final int THIRDWORD = 2;
		final int FOURTHWORD = 3;

		Scanner keypad = new Scanner(System.in);
		Map<String, String> dictionary = new HashMap<String, String>();
		
		
		dictionary.put("change", "valid");
		dictionary.put("flee", "valid");
		dictionary.put("move ","valid");
		dictionary.put("join", "valid");
		dictionary.put("attack", "valid");
		dictionary.put("search","valid");
		dictionary.put("pickup", "valid");
		dictionary.put("give", "valid");
		
		
		System.out.println("You have entered a creepy room");
		
		do
		{
			Character character = null;
			System.out.println("What is thy bidding?\n");
			
			input = keypad.nextLine();
			String[] commandLine = input.split(" ");
			
						
			if(dictionary.containsKey(commandLine[FIRSTWORD]))
			{
				if(commandLine[FIRSTWORD].equalsIgnoreCase("change"))
				{
					if(commandLine[SECONDWORD].equalsIgnoreCase("attack"))
					{
					 	character = specifyCharacter(null);	
					}
				}
				System.out.println("Executed, moving onto next command.");
				printCommand(commandLine);
			}
			else if(input.equalsIgnoreCase("quit"))
			{	
				
				System.out.println("Now quitting.");				
				done = true;
			}
			else
			{	
				
				System.out.println("Invalid Command, try again.");
			}
		
		}while(!done);
		
	}
	
	public Character specifyCharacter(Party group) 
	{
	   int index = 1;
	   int choice = 0;
	    
	    Character creature = null;
	    Scanner keys = new Scanner(System.in);
	    CompositeIterator iterator = (CompositeIterator)group.createIterator();

	    while(iterator.hasNext())
	    {
	    	System.out.println("(+"+index+")"+ "   "+ group.getChild(index-1));  //index is the number or choice represented by the character
			index++;

	    }
	        
		System.out.println("Choose a number for specific character");
		
//		do
//		{  
//		   choice = Integer.parseInt(keys.nextLine());
//		
//		if (choice > 0 && choice < index)
//		   creature = group.getChild(choice);
//	         else
//		 
//	      		System.out.println("Please choose a number from the list of party members");
//		}while(!done);
		
	   return creature;
		
	   }
	
	public static void printCommand(String[] comm)
	{
		
		for(int x = 0; x < comm.length; x++)
			System.out.println(comm[x]);
	}
}
