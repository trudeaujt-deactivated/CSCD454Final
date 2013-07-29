
public abstract class CharacterSpawn 
{
	public Character requestCharacter(String type)
	{
		Character character;
		character = generate(type);
		
		return character;
		
	}
	protected abstract Character generate(String type);
}
