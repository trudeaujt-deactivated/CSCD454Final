
public class CharacterFactory 
{
	CharacterComponents characterComponents;

	
	public Character makeCharacter(String type) 
	{
		Character character = null;
	
		if (type.equalsIgnoreCase("wolf")) 
		{
			
			characterComponents = new WolfParts();
			character = new Wolf(characterComponents);
		} 
	
		if  (type.equalsIgnoreCase("menace")) 
		{
			
			characterComponents = new MenaceParts();
			character = new Menace(characterComponents);
		}
	
		return character;
	}
}