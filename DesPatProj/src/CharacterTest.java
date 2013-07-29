import java.util.ArrayList;


public class CharacterTest 
{

	public static void main(String[] args) 
	{
		CharacterSpawn char1 = new CharacterFriendly();
		CharacterSpawn char2 = new CharacterEnemy();
		
		PartyComponent goodParty = new Party("Good Guys", new ArrayList<PartyComponent>());
		PartyComponent enemyParty = new Party("Enemy", new ArrayList<PartyComponent>());
		PartyComponent moreEnemy = new Party("Enemy Addition", new ArrayList<PartyComponent>());
		
		Character bad = null;
		Character good = null;
		Character hero = null;

		
		
		good = char1.generate("wolf");			//friend
		goodParty.add(new PartyMember(good));	// creates a PartyMember out of the Character and adds it to a Party
		System.out.println(good);
		
		
		bad = char1.generate("menace");			//foe
		enemyParty.add(new PartyMember(bad)); 	// creates a PartyMember out of the Character and adds it to a Party
		System.out.println(bad);

		
		bad = char2.generate("menace");			//foe
		enemyParty.add(new PartyMember(bad));	// creates a PartyMember out of the Character and adds it to a Party
		System.out.println(bad);

		good = char2.generate("wolf");		//friend
		goodParty.add(new PartyMember(good));	// creates a PartyMember out of the Character and adds it to a Party
		System.out.println(good);
		
		
		hero = char1.generate("hero");			//friend
		goodParty.add(new PartyMember(hero));	// creates a PartyMember out of the Character and adds it to a Party
		System.out.println(hero);
		
		for(int i = 0; i < 5; i++){
			bad = char2.generate("menace");
			moreEnemy.add(new PartyMember(bad));// creates a PartyMember out of the Character and adds it to a Party
		}
		
		enemyParty.add(moreEnemy);				// treats the entire new Party as a member of the Party and adds to the Party
		
		goodParty.print();	
		enemyParty.print();

	}

}
