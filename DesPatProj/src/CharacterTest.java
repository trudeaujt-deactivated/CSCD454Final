
public class CharacterTest 
{

	public static void main(String[] args) 
	{
		CharacterSpawn char1 = new CharacterFriendly();
		CharacterSpawn char2 = new CharacterEnemy();

		Character bad = null;
		Character good = null;
		Character hero = null;

		
		
		good = char1.generate("wolf");			//friend
		System.out.println(good);
		
		bad = char1.generate("menace");			//friend
		System.out.println(bad);

		
		bad = char2.generate("menace");			//foe
		System.out.println(bad);

		good = char2.generate("wolf");			//friend
		System.out.println(good);
		
		
		hero = char1.generate("hero");			//friend
		System.out.println(hero);


	}

}
