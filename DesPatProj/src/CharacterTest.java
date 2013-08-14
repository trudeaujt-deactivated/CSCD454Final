import java.util.*;

public class CharacterTest 
 {
	PartyComponent goodParty;
	PartyComponent enemyParty;
	PartyComponent moreEnemy;
	
	
	public static void main(String[] args)
 	{	
		
		CharacterTest characterTest = new CharacterTest();
		Game game = new Game();
		
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
		
//		characterTest.commandInterpreter(characterTest.goodParty, characterTest.enemyParty);
	
//		characterTest.commandInterpreter2(game);
		
		
//		
//		for(int i = 0; i < 5; i++)
//		{
//			HealingPotion heal = new HealingPotion();
//			System.out.println(heal);
//			
//			ItemWeapon weapon = new ItemWeapon();
//			System.out.println(weapon);
//			
//			ItemUser user = new ItemUser();
//			System.out.println(user);
//		}
			


		
		
 	}

//	public void commandInterpreter2(Game game)

	
	public static <T extends PartyComponent>void testBehavior(T partyOne, T partyTwo)
	{
		Battle<T> battle = new Battle<T>(partyOne, partyTwo);
		battle.start();
		
		partyOne.showStats();
		partyTwo.showStats();
		
			
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
 
