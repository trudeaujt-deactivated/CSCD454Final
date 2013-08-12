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
		
 		Character bad,good,hero,good2,bad2,good3; 
 		
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

		CommandCenter controller = new CommandCenter();
	
		Scanner keypad = new Scanner(System.in);
		Map<String, String> dictionary = new HashMap<String, String>();
		
		
		dictionary.put("change", "valid");
		dictionary.put("flee", "valid");
		dictionary.put("move","valid");
		dictionary.put("join", "valid");
		dictionary.put("attack", "valid");
		dictionary.put("search","valid");
		dictionary.put("pickup", "valid");
		dictionary.put("give", "valid");
		dictionary.put("help","valid");
		dictionary.put("east", "valid");
		dictionary.put("west", "valid");
		dictionary.put("north", "valid");
		dictionary.put("south", "valid");
		
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
						character = chooseMembers(goodParty);
						
						System.out.println(character.attackStyle.toString());
						AddAttackBehavior changeAttack = new AddAttackBehavior(chooseAttack(),character);
						System.out.println(character.attackStyle.toString());
						
					 	controller.setCommand(changeAttack);
					 	controller.sendCommand();
					}
					if(commandLine[SECONDWORD].equalsIgnoreCase("defense"))
					{
						character = chooseMembers(goodParty);
						
						System.out.println(character.defendStyle.toString());
						AddDefenseBehavior changeDefense = new AddDefenseBehavior(chooseDefense(),character);
						System.out.println(character.defendStyle.toString());

					 	controller.setCommand(changeDefense);
					 	controller.sendCommand();
					}
					if(commandLine[SECONDWORD].equalsIgnoreCase("flee"))
					{
						character = chooseMembers(goodParty);
					
						System.out.println(character.fleeStyle.toString());
						AddFleeBehavior changeFlee = new AddFleeBehavior(chooseFlee(),character);
						System.out.println(character.fleeStyle.toString());

					 	controller.setCommand(changeFlee);
					 	controller.sendCommand();
					}
				}
				else if(commandLine[FIRSTWORD].equalsIgnoreCase("attack"))
				{
					AddAttack attack = new AddAttack(goodParty,enemyParty); 
					controller.setCommand(attack);
					controller.sendCommand();					
				}
				else if(commandLine[FIRSTWORD].equalsIgnoreCase("help"))
				{	
					System.out.println("Here is the list of possible commands");
				}
				else if(commandLine[FIRSTWORD].equalsIgnoreCase("search"))
				{	
					//displayRoomOverview()
					//displayDeadGuysInRoom()
					//displayRoomItems()
					//AddSearch search = new AddSearch(room);

					
					//search a character for items
					//getCharactersList() includes deadCharacters
					//get Dead Characters' Items list from a dead character
					Character ch = chooseMembers(goodParty);
					AddSearch  search = new AddSearch(ch);
									
					controller.setCommand(search);
					controller.sendCommand();
					
				}
				else if(commandLine[FIRSTWORD].equalsIgnoreCase("join"))
				{
					Character ch = chooseMembers(enemyParty);
					AddJoin member = new AddJoin(ch);
					controller.setCommand(member);
					controller.sendCommand();

				}
				else if(commandLine[FIRSTWORD].equalsIgnoreCase("pickup"))
				{
				
					//Item item = getRoomItemsList();
					
					
					Item item = null;
					Character ch = chooseMembers(goodParty);
					AddInventory addedInventoryItem = new AddInventory(item,ch);
				
					controller.setCommand(addedInventoryItem);
					controller.sendCommand();
					
				}
				else if(commandLine[FIRSTWORD].equalsIgnoreCase("flee"))
				{
					Direction fleeDirection = null;
					
					if(dictionary.containsKey(commandLine[SECONDWORD]))					
					{	
						if(commandLine[SECONDWORD].equalsIgnoreCase("north"))
						{
							AddFlee flee = new AddFlee(fleeDirection);
							controller.setCommand(flee);
							controller.sendCommand();
						}
						else if(commandLine[SECONDWORD].equalsIgnoreCase("south"))
						{
							AddFlee flee = new AddFlee(fleeDirection);
							controller.setCommand(flee);
							controller.sendCommand();
						}
						else if(commandLine[SECONDWORD].equalsIgnoreCase("east"))
						{
							AddFlee flee = new AddFlee(fleeDirection);
							controller.setCommand(flee);
							controller.sendCommand();
						}
						else if(commandLine[SECONDWORD].equalsIgnoreCase("west"))
						{
							AddFlee flee = new AddFlee(fleeDirection);
							controller.setCommand(flee);
							controller.sendCommand();
						}
						else
							System.out.println("Could not move there!");
					}

				}
				else if(commandLine[FIRSTWORD].equalsIgnoreCase("move"))
				{
					Direction moveDirection = null;
										
					if(dictionary.containsKey(commandLine[SECONDWORD]))					
					{	
						
						if(commandLine[SECONDWORD].equalsIgnoreCase("north"))
						{
							AddMove move = new AddMove(moveDirection);
							controller.setCommand(move);
							controller.sendCommand();
						}
						else if(commandLine[SECONDWORD].equalsIgnoreCase("south"))
						{
							AddMove move = new AddMove(moveDirection);
							controller.setCommand(move);
							controller.sendCommand();
						}
						else if(commandLine[SECONDWORD].equalsIgnoreCase("east"))
						{
							AddMove move = new AddMove(moveDirection);
							controller.setCommand(move);
							controller.sendCommand();
						}
						else if(commandLine[SECONDWORD].equalsIgnoreCase("west"))
						{
							AddMove move = new AddMove(moveDirection);
							controller.setCommand(move);
							controller.sendCommand();
						}
						else
							System.out.println("Could not move there!");
					}

				}
				else if(commandLine[FIRSTWORD].equalsIgnoreCase("give"))
				{
				
					Character ch1 = chooseMembers(goodParty);
					Character ch2 = chooseMembers(goodParty);
					Item item = new UserItem("Horse");
					
					AddGivenItem givenItem = new AddGivenItem(ch1,item, ch2);
	
					controller.setCommand(givenItem);
					controller.sendCommand();
					
				}
			}//end if(word is in dictionary)
			
			else if(input.equalsIgnoreCase("quit"))
			{	
				System.out.println("Now quitting.");				
				done = true;
			}
			else
			    System.out.println("Invalid Command, try again.");

		}while(!done);

	
	}
	
	public Character chooseMembers(PartyComponent anyParty) 
	{
		int index = 0;
		PartyMember member = null;
		Character[] teamMates = new Character[5];
		Character choosenCharacter = null;
		CompositeIterator iterator = (CompositeIterator)anyParty.createIterator();

		while(choosenCharacter == null)
		{
			System.out.println("***************************************");
			System.out.println("Choose a number for specific character\n");
			
			displayCharacterChoices(anyParty);

			while(iterator.hasNext())
			{
				member = (PartyMember) iterator.next();  //iterate through characters, put them into an array
				choosenCharacter = member.character;     //for retrieval, couldn't get the getMember() by index working 
				teamMates[index] = choosenCharacter;     //  choosenMember = getMember(index);  not sure if one exists
				index++;
			}
			System.out.println("\n***************************************");

			choosenCharacter = teamMates[menuRun(index)];
		}
		return choosenCharacter;
	}

	public int displayCharacterChoices(PartyComponent anyParty)
	{
		int index = 0;
		PartyMember member;
		Character displayedCharacter;
		
		CompositeIterator iterator = (CompositeIterator)anyParty.createIterator();
		while(iterator.hasNext())
		{
			member = (PartyMember) iterator.next();
			displayedCharacter = member.character;
			
			System.out.print(index + ")");
			System.out.println("   "+displayedCharacter.getName().toString());
			index++;
		}

		return index;
	}
	
	public AttackBehavior chooseAttack()
	{
		AttackBehavior behave = null;
		
		do
		{
			int index = 0;

			System.out.println("\n***************************************");
			System.out.println("AttackStyles for Characters\n");
	
			for(int x = 0; x < AttackBehavior.attackArray.length; x++,index++)
			{
				System.out.print(index + ")");
				System.out.println(" "+ AttackBehavior.attackArray[x].toString());
			}
			
			System.out.println("\n***************************************");
	
			behave = AttackBehavior.attackArray[menuRun(index)];
		
		}while(behave == null);
		
		return behave;
	}
	
	public DefenseBehavior chooseDefense()
	{
		DefenseBehavior behave = null;
		
		do
		{
			System.out.println("\n***************************************");
			System.out.println("DefenseStyles for Characters\n");
	
			int index = 0;
			for(int x = 0; x < DefenseBehavior.defenseArray.length; x++,index++)
			{
				System.out.print(index + ")");
				System.out.println(" "+ DefenseBehavior.defenseArray[x].toString());
			}
			
			System.out.println("\n***************************************");
	
			behave = DefenseBehavior.defenseArray[menuRun(index)];
		}while(behave == null);
		
		return behave;
	}
	
	public FleeBehavior chooseFlee()
	{
		FleeBehavior behave = null;
		
		do
		{
			System.out.println("\n***************************************");
			System.out.println("FleeStyles for Characters\n");
	
			int index = 0;
			for(int x = 0; x < FleeBehavior.fleeBehavior.length; x++,index++)
			{
				System.out.print(index + ")");
				System.out.println(" "+ FleeBehavior.fleeBehavior[x].toString());
			}
			
			System.out.println("\n***************************************");
			behave = FleeBehavior.fleeBehavior[menuRun(index)];
	
		}while(behave == null);
	
		return behave;
	}
 	
	public int menuRun(int index)
	{
		int menu = 0;
		final int MINIMUM = -1;
		boolean done = false;
		
		Scanner keyboard = new Scanner(System.in);
	
		do
		{
			try
			{
				menu = Integer.parseInt(keyboard.nextLine());
			}
			catch(Exception e)
			{
				System.out.println("Numbers only!");
			}
			
			if(menu > MINIMUM && menu < index)
				done = true;
			
			else
			{
				System.out.println("Just make a valid numerical choice!");
				System.out.println("\n***************************************");
			}
	
		}while(!done);
		
	return menu;
	}

 
 
 }
 
