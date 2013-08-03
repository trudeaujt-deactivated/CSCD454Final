import java.util.List;
import java.util.ArrayList;


public class Battle {

	private Party playerParty;
	private Party enemyParty;
	private CompositeIterator enemyIterator;
	private CompositeIterator playerIterator;
	private List<PairUp> pairUps; 

	public Battle(){};
	public Battle(Party player, Party enemy){
		this.playerParty = player;
		this.enemyParty = enemy;

		this.playerIterator = (CompositeIterator)playerParty.createIterator();
		this.enemyIterator = (CompositeIterator)enemyParty.createIterator();
		pairUps = new ArrayList<PairUp>();
		squareOff();
		start();
	}

	public void squareOff(){

		while(playerIterator.hasNext() &&
				enemyIterator.hasNext()){
			createPair();
		}

		/* keep pairing up while either party still has unpaired members.. so there are some 2 on one situations**********/
		if(playerIterator.hasNext()){
			this.enemyIterator = (CompositeIterator)enemyParty.createIterator();
			while(playerIterator.hasNext()){
				createPair();
			}
		}

		else if(enemyIterator.hasNext()){
			this.playerIterator = (CompositeIterator)(playerParty.createIterator());
			while(enemyIterator.hasNext()){
				createPair();
			}
		}
	}


	public void createPair(){
		PartyMember player = (PartyMember)playerIterator.next();
		PartyMember enemy = (PartyMember)enemyIterator.next();
		PairUp nextPair = new PairUp(player, enemy);
		pairUps.add(nextPair);
	}

	/*kicks off the battle*/
	public void start(){
		ArrayList<PairUp> toRemove = new ArrayList<PairUp>();
		while(checkParties()){
			
			for(PairUp p:pairUps){
				System.out.println(p.exchange());
				if(p.getPlayer().checkHealth() == false || p.getEnemy().checkHealth() == false)
					toRemove.add(p);
			}
			
			for(PairUp rem: toRemove){
				//System.out.println("removing: " + rem + "\n");
				pairUps.remove(rem);
			}
			
			
		}
	}
	public boolean checkParties(){
		if(playerParty.stillInPlay() && enemyParty.stillInPlay())
			return true;
		return false;
	}




}
