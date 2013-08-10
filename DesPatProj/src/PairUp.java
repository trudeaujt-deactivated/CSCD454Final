
public class PairUp {
	
	private PartyMember player;
	private PartyMember enemy;
	private ExchangeResult er;
	
	public PairUp(){}
	
	public PairUp(PartyMember player, PartyMember enemy){
		
		assert(player!=null);
		assert(enemy!=null);
		
		this.player = player;
		this.enemy = enemy;
	}
	
	public ExchangeResult exchange(){
		
		int playerDamageDealt;
		int enemyDamageDealt;
		assert(player.character != null);
		playerDamageDealt = player.character.attackStyle.attack(player, enemy);
		enemyDamageDealt = enemy.character.attackStyle.attack(enemy, player);
		
		er = new ExchangeResult(this, playerDamageDealt, enemyDamageDealt);
		
		player.character.health.decrementHitPoints(enemyDamageDealt);
		enemy.character.health.decrementHitPoints(playerDamageDealt);
		player.checkHealth();
		enemy.checkHealth();
		
		return er;
	}
	
	public PartyMember getPlayer(){
		return player;
	}
	public PartyMember getEnemy(){
		return enemy;
	}
	@Override
	public String toString(){
		return "" + player.getName() + " " + enemy.getName();
	}
	

}
