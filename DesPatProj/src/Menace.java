import java.util.ArrayList;


public class Menace extends Character
{
	CharacterComponents characterComponents;
		
		
		
		public Menace(CharacterComponents characterComponent)
		{
			
			this.characterComponents = characterComponent;
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
