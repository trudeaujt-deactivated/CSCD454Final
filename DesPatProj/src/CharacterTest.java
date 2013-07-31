import java.util.ArrayList;



public class CharacterTest 
 {
	public static void main(String[] args)
 	{
 	//	CharacterRequest char1 = new CharacterFriendly();
 	//	CharacterRequest char2 = new CharacterEnemy();
 		CharacterRequest testCharacter = new CharacterSpawn();

		
		PartyComponent goodParty = new Party("Good Guys", new ArrayList<PartyComponent>());
		PartyComponent enemyParty = new Party("Enemy", new ArrayList<PartyComponent>());
		PartyComponent moreEnemy = new Party("Enemy Addition", new ArrayList<PartyComponent>());
		
 		Character bad = null;
 		Character good = null;
 		Character hero = null;
 		Character good2 = null;
 		Character bad2 = null;
 		
 		
 		good = testCharacter.generate("random");			//friend
		goodParty.add(new PartyMember(good));	// creates a PartyMember out of the Character and adds it to a Party
 		System.out.println(good);
 		
		bad = testCharacter.generate("random");			//friend
		
		bad = testCharacter.generate("random");			//foe
		enemyParty.add(new PartyMember(bad)); 	// creates a PartyMember out of the Character and adds it to a Party
 		System.out.println(bad);
 
 		
 		bad2 = testCharacter.generate("random");			//foe
		enemyParty.add(new PartyMember(bad2));	// creates a PartyMember out of the Character and adds it to a Party
 		System.out.println(bad2);
 
		good2 = testCharacter.generate("random");			//friend
		goodParty.add(new PartyMember(good2));	// creates a PartyMember out of the Character and adds it to a Party
 		System.out.println(good2);
 		
 		
 		hero = testCharacter.generate("hero");			//friend
		goodParty.add(new PartyMember(hero));	// creates a PartyMember out of the Character and adds it to a Party
 		System.out.println(hero);

		
		for(int i = 0; i < 5; i++)
		{
			bad = testCharacter.generate("random");
			moreEnemy.add(new PartyMember(bad));// creates a PartyMember out of the Character and adds it to a Party
		}
		
		enemyParty.add(moreEnemy);				// treats the entire new Party as a member of the Party and adds to the Party
		
		goodParty.print();	
		enemyParty.print();
		
 	}
 }
 
