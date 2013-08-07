
public class ExchangeResult {
	private PairUp pairUp;
	private int playerDamageDealt;
	private int enemyDamageDealt;
	
	public ExchangeResult(){}
	public ExchangeResult(PairUp p, int player, int enemy){
		
		pairUp = p;
		playerDamageDealt = player;
		enemyDamageDealt = enemy;
		
	}
	
	public String toString(){
		return pairUp.getPlayer().getName() + 
				"(Player) dealt " +	playerDamageDealt + " points of damage to " + 
				pairUp.getEnemy().getName() +  "." + "\n" + 
				pairUp.getEnemy().getName() + "(Enemy) dealt " + 
				enemyDamageDealt + " points of damage to " + 
				pairUp.getPlayer().getName() + ".\n\n";
	}

}
