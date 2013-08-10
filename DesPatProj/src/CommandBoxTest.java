import java.io.*;
import java.util.*;


public class CommandBoxTest 
{
	
	public static void main(String[] args) throws NullPointerException
	{
		
		CommandBoxTest box = new CommandBoxTest();
		box.commandInterpreter();
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
	


		