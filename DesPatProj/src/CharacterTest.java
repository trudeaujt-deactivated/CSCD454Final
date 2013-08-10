import java.util.*;

public class CharacterTest 
 {
	PartyComponent goodParty;
	PartyComponent enemyParty;
	PartyComponent moreEnemy;
	
	
	public static void main(String[] args)
 	{	
		CharacterTest characterTest = new CharacterTest();
 		CharacterRequest testCharacter = new CharacterSpawn();
		
 		characterTest.goodParty = new Party("Good Guys", new ArrayList<PartyComponent>());
 		characterTest.enemyParty = new Party("Enemy", new ArrayList<PartyComponent>());
 		characterTest.moreEnemy = new Party("Enemy Addition", new ArrayList<PartyComponent>());
		
 		Character bad; 
 		Character good;
 		Character hero;
 		
 		Character good2; 
 		Character bad2;
 		Character good3;
 		
 		
 		good = testCharacter.generate("mobster","weak");			//friend
 		characterTest.goodParty.add(new PartyMember(good));	// creates a PartyMember out of the Character and adds it to a Party
 		
		bad = testCharacter.generate("outcast", "average");			//friend
		characterTest.enemyParty.add(new PartyMember(bad));
		
		testBehavior(new PartyMember(good), new PartyMember(bad));
		
		System.out.println("**************************End one on one Test************************************");
		
		bad = testCharacter.generate("menace", "weak");			//foe
		characterTest.enemyParty.add(new PartyMember(bad)); 	// creates a PartyMember out of the Character and adds it to a Party
 
 		
 		bad2 = testCharacter.generate("wolf","average");			//foe
 		characterTest.enemyParty.add(new PartyMember(bad2));	// creates a PartyMember out of the Character and adds it to a Party
 
		good2 = testCharacter.generate("swarmofbees", "tough");			//friend
		characterTest.goodParty.add(new PartyMember(good2));	// creates a PartyMember out of the Character and adds it to a Party
		
		good3 = testCharacter.generate("random", "tough");			//friend
		characterTest.goodParty.add(new PartyMember(good3));	// creates a PartyMember out of the Character and adds it to a Party
		
		
 		
 		hero = testCharacter.generate("hero","tough");			//friend
 		characterTest.goodParty.add(new PartyMember(hero));	// creates a PartyMember out of the Character and adds it to a Party
		
		
		for(int i = 0; i < 5; i++)
		{
			bad = testCharacter.generate("random","weak");
			characterTest.moreEnemy.add(new PartyMember(bad));// creates a PartyMember out of the Character and adds it to a Party
		}

		testBehavior(characterTest.goodParty, characterTest.enemyParty);
		
		System.out.println("Done with Test");
		
		characterTest.commandInterpreter(characterTest.goodParty, characterTest.enemyParty);
		
		

 	}
	
	public static <T extends PartyComponent>void testBehavior(T partyOne, T partyTwo)
	{
		Battle<T> battle = new Battle<T>(partyOne, partyTwo);
		battle.start();
		
		partyOne.showStats();
		partyTwo.showStats();
		
			
	}
	
	public void commandInterpreter(PartyComponent goodParty2, PartyComponent enemyParty2)
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
					 	character = specifyCharacter(enemyParty2);	
					 
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
	
	public Character specifyCharacter(PartyComponent goodParty) 
	{
	   int index = 1;
	   int choice = 0;
	   PartyMember member = null;
	   boolean done = false;
	    
	    Character creature = null;
	    Scanner keys = new Scanner(System.in);

		System.out.println("Choose a number for specific character");
		
		CompositeIterator iterator = (CompositeIterator)goodParty.createIterator();
		while(iterator.hasNext())
		//	if(iterator.next().)
		{
		
			member = (PartyMember) iterator.next();
			System.out.print("("+index+")"+"   "+member.toString());
			index++;
			System.out.println("Check it out!");
		//	member.character.name.toString();
		}
		
		do
		{  
		   choice = Integer.parseInt(keys.nextLine());
		
		   if (choice > 0 && choice < index)
			   creature = characterFromMember(member);
	       
		   else
	      		System.out.println("Please choose a number from the list of party members");
		
		}while(!done);
		
	   return creature;
	   }
	
	private Character characterFromMember(PartyMember member) 
	{
		PartyMember temp1;// = new PartyMember();
		member.getCharacter();
		return null;
	}

	public static void printCommand(String[] comm)
	{
		
		for(int x = 0; x < comm.length; x++)
			System.out.println(comm[x]);
	}
	
	

	
 }
 
