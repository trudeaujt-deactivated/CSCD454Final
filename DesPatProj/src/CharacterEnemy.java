
public class CharacterEnemy extends CharacterSpawn
{
	CharacterFactory factory;
	Character character = null;

	
	
	@Override
	protected Character generate(String type) 
	{
		
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
	
		return character;
	}
}
