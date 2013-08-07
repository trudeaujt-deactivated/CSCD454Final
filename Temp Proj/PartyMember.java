import java.util.ArrayList;


public class PartyMember extends PartyComponent {
	
	Character character;
	
	public PartyMember(Character character){
		this.character = character;
		
	}
	public Name getName(){
		return character.name;
	}
	public Health getHealth(){
		return character.health;
	}
	public Race getRace(){
		return character.race;
	}
	public Level getLevel(){
		return character.level;
	}
	public ArrayList<Item> getItems(){
		return character.inventory;
	}
	public void print(){
		System.out.println(character);
	}
	
}
