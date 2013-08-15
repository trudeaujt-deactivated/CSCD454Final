import java.util.ArrayList;
import java.util.Iterator;


public class Party extends PartyComponent {
	
	private ArrayList<PartyComponent> partyMembers = new ArrayList<PartyComponent>();
	private String partyName;
	private Iterator<PartyComponent> iterator;
	
	public Party(){
		partyName = "Generic Party";
	}
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
	
	public String print(){
		String ret = "\nParty Name: " + partyName + "\n";
		iterator = partyMembers.iterator();
		while(iterator.hasNext()){
			PartyComponent partyComponent = (PartyComponent)iterator.next();
			ret += ((PartyMember)partyComponent).toString() + "\n";
			//partyComponent.print();
		}
		return ret;
	}
	
	@Override
	public Iterator createIterator(){
		return new CompositeIterator(partyMembers.iterator());
	}


	public String showStats(){
		String ret = "";
		iterator = partyMembers.iterator();
		while(iterator.hasNext()){
			PartyComponent partyComponent = (PartyComponent)iterator.next();
			partyComponent.showStats();
	
			
		}
		
		return ret;
	}
	public PartyComponent wrap(String name){
		return this;
	}
	public boolean hasMembers(){
		boolean check = partyMembers.size()>0;
		System.out.println("check returned: " + check);
		return check;
	}

}
