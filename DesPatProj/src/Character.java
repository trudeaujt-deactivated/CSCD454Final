import java.util.ArrayList;


public abstract class Character 
{
	CharacterGenerator genesis;
	
	protected Name name;
	protected Health health;
	protected Race race;
	protected Level level;
	protected ArrayList<Item> inventory = new ArrayList<Item>();
	protected AttackBehavior attackStyle;
	protected DefenseBehavior defendStyle;
	protected FleeBehavior fleeStyle;
	protected BonusHitPoints bonus;
	protected ItemWeapon weapon;
	
	protected Character(CharacterGenerator factory, String type)
	{
		this.genesis = factory;
		
		this.name = genesis.createName();
		this.level = genesis.createLevel();
		this.health = genesis.createHealth();
		this.race = genesis.createRace(type);
		this.attackStyle = genesis.createAttackBehavior();
		this.defendStyle = genesis.createDefenseBehavior();
		this.fleeStyle = genesis.createFleeBehavior();
		this.inventory = new ArrayList<Item>();
		this.bonus = new BonusHitPoints(calculateBonusPoints());
	}

	public ItemWeapon getWeapon()
	{
		return this.weapon;
	}
	
	public void setWeapon(ItemWeapon wield)
	{
		this.weapon = wield;
	}

	public String getName(){
		return name.toString() + " " + race.toString();
	}
	public String getRace(){
		return race.toString();
	}
	public int getHealth(){
		return this.health.getHitPoints();
	}
	protected void setHealth(int hp){
		this.health.setHitPoints(hp);
	}
	
	public void setAttackStyle(AttackBehavior attackStyle) {
		this.attackStyle = attackStyle;
	}
	public void setDefendStyle(DefenseBehavior defendStyle) {
		this.defendStyle = defendStyle;
	}
	public void setFleeStyle(FleeBehavior fleeStyle) {
		this.fleeStyle = fleeStyle;
	}

	public int calculateBonusPoints() {
		
		int total = 0;
		
		for(Item item : inventory)
		{
			if(item.getClass().getSimpleName().equals("ItemUser"))
			{
			//	System.out.println("Item only "+ total);
				total += item.getPoints();
			
				System.out.println("I am "+ name.toString()+ " "+race.toString());
				System.out.println(item.toString()+" "+total);

				
			}
//			if(item.getClass().getSimpleName().equals("ItemWeapon"))
//			{
//				System.out.println("Weapon only " + total);
//				total += item.getPoints();
//				System.out.println(item.toString()+" "+total);
//
//			}
		}
			
		return total;
	}
	

	@Override
	public String toString() {
		return "Character [name=" + name + ", health=" + health + ", race="
				+ race + ", inventory=" + inventory + ", attackStyle="
				+ attackStyle + ", defendStyle=" + defendStyle + ", fleeStyle="
				+ fleeStyle + ", bonus=" + bonus + "]";
	}
	

}
