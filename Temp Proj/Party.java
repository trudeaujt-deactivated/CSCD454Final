import java.util.ArrayList;
import java.util.Iterator;


public class Party extends PartyComponent {
	ArrayList<PartyComponent> partyMembers = new ArrayList<PartyComponent>();
	String partyName;
	
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
		Iterator<PartyComponent> iterator = partyMembers.iterator();
		while(iterator.hasNext()){
			PartyComponent partyComponent = (PartyComponent)iterator.next();
			partyComponent.print();
		}
		
	}
	
}
