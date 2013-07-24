import java.util.ArrayList;


public class Wolf extends Character implements CharacterBehavior
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


	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void flee() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
