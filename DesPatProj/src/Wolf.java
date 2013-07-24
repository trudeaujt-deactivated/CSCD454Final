import java.util.ArrayList;


public class Wolf extends Character 
{
	CharacterFactory characterFactory;
	
	
	
	public Wolf(CharacterFactory characterFactory)
	{
		
		this.characterFactory = characterFactory;
	}
	

	@Override
	void makeCharacter() 
	{
		
		name = characterFactory.createName();
		health = characterFactory.createHealth();
		level = characterFactory.createLevel();
		race = characterFactory.createRace();
		inventory = new ArrayList<Item>();
	}

	
}
