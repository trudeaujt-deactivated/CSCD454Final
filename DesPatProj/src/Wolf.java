import java.util.ArrayList;


public class Wolf extends Character 
{
	CharacterComponents characterComponents;
	
	
	
	public Wolf(CharacterComponents characterComponents)
	{
		
		this.characterComponents = characterComponents;
	}
	

	@Override
	void makeCharacter() 
	{
		
		name = characterComponents.createName();
		health = characterComponents.createHealth();
		level = characterComponents.createLevel();
		race = characterComponents.createRace();
		inventory = new ArrayList<Item>();
	}

	
}
