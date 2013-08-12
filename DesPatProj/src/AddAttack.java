
public class AddAttack implements Command 
{
	private PartyComponent good;
	private PartyComponent bad;

	private Battle battle = null;

	public AddAttack(PartyComponent goodParty, PartyComponent enemyParty)
	{
		this.good = goodParty;
		this.bad = enemyParty;
		this.battle = new Battle(goodParty,enemyParty);
		// battle = new Battle(good, bad);
		
	}
	
	
	@Override
	public void execute() 
	{
	//	battle.start();
		
		System.out.println("Calling instance of battle here or performing single attack.");
		System.out.println("Command DOES NOT WORK.  CHECK THE AddAttack.execute() file to fix!");

		//	battle.start();
		//  battle could also be single attack, ONE pass of iteration through each pair, for fight
		//  not necessary, but optional
		//  maybe for a single attack there could be a "firesBack() from the enemy, where each
		//  member would then perform a singleAttack(), everyone fights through each pair ONE time
		//  if a single attack is performed...
		
	}
	


}
