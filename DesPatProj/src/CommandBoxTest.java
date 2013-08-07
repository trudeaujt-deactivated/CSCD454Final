import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.HashMap;


public class CommandBoxTest 
{
	public static void main(String[] args) throws NullPointerException
	{
		String input = null;
		Scanner keypad = new Scanner(System.in);
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("change", "valid");
		dictionary.put("flee", "valid");
		dictionary.put("set","valid");
		dictionary.put("join", "valid");
		dictionary.put("attack", "valid");
		boolean done = false;
		 
		System.out.println("You have entered a creepy room");
		
		
		do
		{
			
			System.out.println("What is thy bidding?\n");
			
			input = keypad.nextLine();
			String[] command = input.split(" ");
			
						
			if(dictionary.containsKey(command[0]))
			{
				
				System.out.println("Execute.");
				printCommand(command);
			}
			
			else if(input.equals("exit"))
			{	
				
				System.out.println("Now exiting.");				
				done = true;
			}
			else
			{	
				
				System.out.println("Invalid Command, try again.");
			}
			
			
			
		}while(!done);
	}//end main
	
	
	public static void addVerbiage()
	{
		
	}
	
	public static void printCommand(String[] comm)
	{
		
		for(int x = 0; x < comm.length; x++)
			System.out.println(comm[x]);
	}
	
	
}
	


		