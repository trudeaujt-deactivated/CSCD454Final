import java.util.ArrayList;
import java.util.*;

public class CharacterTest 
 {
	public static void main(String[] args)
 	{

 		CharacterRequest testCharacter = new CharacterSpawn();
		
		PartyComponent goodParty = new Party("Good Guys", new ArrayList<PartyComponent>());
		PartyComponent enemyParty = new Party("Enemy", new ArrayList<PartyComponent>());
		PartyComponent moreEnemy = new Party("Enemy Addition", new ArrayList<PartyComponent>());
		
 		Character bad; 
 		Character good;
 		Character hero;
 		
 		Character good2; 
 		Character bad2;
 		
 		
 		good = testCharacter.generate("mobster","weak");			//friend
		goodParty.add(new PartyMember(good));	// creates a PartyMember out of the Character and adds it to a Party
 		
		bad = testCharacter.generate("outcast", "average");			//friend
		enemyParty.add(new PartyMember(bad));
		
		testBehavior(new PartyMember(good), new PartyMember(bad));
		System.out.println("*******End one on one Test*****************");
		
		bad = testCharacter.generate("menace", "weak");			//foe
		enemyParty.add(new PartyMember(bad)); 	// creates a PartyMember out of the Character and adds it to a Party
 
 		
 		bad2 = testCharacter.generate("wolf","average");			//foe
		enemyParty.add(new PartyMember(bad2));	// creates a PartyMember out of the Character and adds it to a Party
 
		good2 = testCharacter.generate("swarmofbees", "tough");			//friend
		goodParty.add(new PartyMember(good2));	// creates a PartyMember out of the Character and adds it to a Party
		
 		
 		
 		hero = testCharacter.generate("hero","tough");			//friend
		goodParty.add(new PartyMember(hero));	// creates a PartyMember out of the Character and adds it to a Party
		
		
		for(int i = 0; i < 5; i++)
		{
			bad = testCharacter.generate("random","weak");
			moreEnemy.add(new PartyMember(bad));// creates a PartyMember out of the Character and adds it to a Party
		}
		
		goodParty.print();	
		enemyParty.print();
		
		testBehavior(goodParty, enemyParty);
		
		System.out.println("Done with Test");
		
 	}
	
	public static <T extends PartyComponent>void testBehavior(T partyOne, T partyTwo)
	{
		Battle<T> battle = new Battle<T>(partyOne, partyTwo);
		battle.start();
		
		partyOne.showStats();
		partyTwo.showStats();
		
			
	}
 }
 
