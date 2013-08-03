import java.util.ArrayList;
import java.util.Iterator;


public class Party extends PartyComponent {
	
	private ArrayList<PartyComponent> partyMembers = new ArrayList<PartyComponent>();
	private String partyName;
	private Iterator<PartyComponent> iterator;
	
	public Party(String partyName, ArrayList<PartyComponent> partyMembers){
		
		this.partyName = partyName;
		this.partyMembers = partyMembers;
		
	}
	
	public void add(PartyComponent partyComponent){
		
		partyMembers.add(partyComponent);
	}
	
	public void remove(PartyComponent partyComponent){
		partyMembers.remove(partyComponent);
	}
	
	public PartyComponent getChild(int i){
		return (PartyComponent) partyMembers.get(i);
	}
	
	public void print(){
		System.out.println("Party Name: " + partyName);
		iterator = partyMembers.iterator();
		while(iterator.hasNext()){
			PartyComponent partyComponent = (PartyComponent)iterator.next();
			partyComponent.print();
		}
	}
	
	@Override
	public Iterator createIterator(){
		return new CompositeIterator(partyMembers.iterator());
	}

	public boolean stillInPlay(){
		boolean life = false;
		CompositeIterator ci = (CompositeIterator)createIterator();
		while (ci.hasNext()){
			PartyMember pm = (PartyMember)ci.next();
			if(pm.alive)
				return true;
		}
		System.out.println(this.partyName + " is dead");
		return life;
	}
}
