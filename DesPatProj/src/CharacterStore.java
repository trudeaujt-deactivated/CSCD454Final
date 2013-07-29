
public class CharacterStore
{
	private CharacterFactory factory;// = new CharacterFactory();
	
	public CharacterStore(CharacterFactory factory)
	{
		this.factory = factory;
	}
	
	
	public Character requestCharacter(String type) 
	{
		Character character;
		character = factory.makeCharacter(type);

		return character;
	}

	
}
