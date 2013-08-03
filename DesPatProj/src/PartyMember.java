import java.util.ArrayList;
import java.util.Iterator;


public class PartyMember extends PartyComponent {
	
	Character character;
	boolean alive;
	
	public PartyMember(Character character){
		this.character = character;
		alive = true;
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
	@Override
	public Iterator createIterator(){
		return new NullIterator();
	}
	
	public void attack(PartyMember otherCharacter){
		character.attackStyle.attack(otherCharacter);
	}
	public void defend(){
		character.defendStyle.defend();
	}
	public void flee(){
		character.fleeStyle.flee();
	}
	public boolean checkHealth(){
		alive = character.health.hitPoints > 0;
		return alive;
	}
	
	
}
