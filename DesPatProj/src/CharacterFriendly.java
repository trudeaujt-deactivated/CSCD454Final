
public class CharacterFriendly extends CharacterSpawn 
{
	
	@Override
	protected Character generate(String type) 
	{
		CharacterFactory factory;
		Character character = null;
		
		
		if (type.equalsIgnoreCase("wolf")) 
		{
			factory = new WolfFactory();
			character = new Wolf(factory);
		} 
	
		if  (type.equalsIgnoreCase("menace")) 
		{
			factory = new MenaceFactory();
			character = new Menace(factory);
		}
		
		if  (type.equalsIgnoreCase("hero")) 
		{
			factory = new HeroFactory();
			character = new Menace(factory);
		}
	
		return character;
	}


	
	
	
}