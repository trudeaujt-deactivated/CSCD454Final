import java.util.List;
import java.util.ArrayList;

/*
 * This Battle class takes two parties as arguments, (updated to take two parties or two party members) 
 * creates iterators to handle the parties
 * independently and pairs up the player characters with the enemy characters. If the parties
 * are uneven the squareOff() method continues pairing up the remaining "surplus" characters 
 * so that some characters will end up in two different pairUps. A two on one situation. The pairUp 
 * class handles the individual turn, allowing each pairUp a chance to hit each other, and the damage
 * is updated for each character. If a character dies, the pairUp is taken out of the loop, and the 
 * surviving character sits out until the battle is over. The Battle continues until one entire Party
 * is dead. 
 */
public class Battle <T extends PartyComponent>{

	private T playerParty;
	private T enemyParty;
	private CompositeIterator enemyIterator;
	private CompositeIterator playerIterator;
	private List<PairUp> pairUps; 

	public Battle(){};
	@SuppressWarnings("unchecked")
	public Battle( T player, T enemy){
		this.playerParty = player;
		this.enemyParty = enemy;
		playerParty = (T)playerParty.wrap("Player");
		enemyParty = (T)enemyParty.wrap("Enemy");
		
		this.playerIterator = (CompositeIterator)playerParty.createIterator();
		this.enemyIterator = (CompositeIterator)enemyParty.createIterator();
		pairUps = new ArrayList<PairUp>();
		squareOff();
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

	public void start(){
		ArrayList<PairUp> toRemove = new ArrayList<PairUp>();
		System.out.println("Fighting......");
		while(checkParties()){
			toRemove.clear();		
			for(PairUp p:pairUps){

				System.out.println(p.exchange());
				if(p.getPlayer().checkHealth() == false || p.getEnemy().checkHealth() == false){
					toRemove.add(p);
				}

			}
			if( toRemove.size() > 0 ){
				for(PairUp rem: toRemove){
					assert(pairUps.remove(rem) != false);
				}
			}
		}
	}
	public boolean checkParties(){
		return (playerParty.stillInPlay() && enemyParty.stillInPlay());
	}





}
