import java.util.ArrayList;
/*
 * This is the Component of the Composite pattern used to handle the players and the parties
 */
public abstract class PartyComponent {
	
	// methods pertaining to "composite"
	public void add(PartyComponent partyComponent){
		throw new UnsupportedOperationException();
	}
	public void remove(PartyComponent partyComponent){
		throw new UnsupportedOperationException();
	}
	
	public PartyComponent getChild(int which){
		throw new UnsupportedOperationException();
	}
	//methods pertaining to PartyMember and/or Party
	public Name getName(){
		throw new UnsupportedOperationException();
	}
	public Health getHealth(){
		throw new UnsupportedOperationException();
	}
	public Race getRace(){
		throw new UnsupportedOperationException();
	}
	public Level getLevel(){
		throw new UnsupportedOperationException();
	}
	public ArrayList<Item> getItems(){
		
		throw new UnsupportedOperationException();
	}
	public void print(){
		throw new UnsupportedOperationException();
	}
}
