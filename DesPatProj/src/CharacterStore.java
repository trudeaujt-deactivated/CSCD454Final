
public abstract class CharacterStore
{
	public  Character requestCharacter(Race race)
	{
		Character character;
		character = createCharacter(race);
		
		return character;
		
	}
	
	abstract Character createCharacter(Race race);
}