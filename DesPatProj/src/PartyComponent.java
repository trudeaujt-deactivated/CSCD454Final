import java.util.ArrayList;
import java.util.Iterator;
/*
 * This is the Component of the Composite pattern used to handle the players and the parties
 */
public abstract class PartyComponent{
	
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
		boolean life = false;
		CompositeIterator ci = (CompositeIterator)createIterator();
		while (ci.hasNext()){
			PartyMember pm = (PartyMember)ci.next();
			if(pm.alive)
				return true;
		}
		return life;
	}
	public abstract String showStats();
	public abstract Iterator createIterator();
	public abstract PartyComponent wrap(String name);
}
