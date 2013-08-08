import java.util.ArrayList;
import java.util.Iterator;
/*
 * This is the Component of the Composite pattern used to handle the players and the parties
 */
public abstract class PartyComponent{
	private Iterator<PartyComponent> iterator;
	
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
	public boolean stillInPlay(){
		
		CompositeIterator ci = (CompositeIterator)createIterator();
		PartyMember pm = (PartyMember)ci.next();
		while(ci.hasNext()){
			if(pm.alive)
				return true;
			pm = (PartyMember)ci.next();
		}
		return false;
		
	}
	public abstract String showStats();
	public abstract Iterator createIterator();
	public abstract PartyComponent wrap(String name);
}
