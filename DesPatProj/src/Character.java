import java.util.ArrayList;


public abstract class Character 
{
	CharacterGenerator genesis;
	
	protected Name name;
	protected Health health;
	protected Race race;
	protected Level level;
	protected Leftovers leftover;
	protected ArrayList<Item> inventory = new ArrayList<Item>();
	protected AttackBehavior attackStyle;
	protected DefenseBehavior defendStyle;
	protected FleeBehavior fleeStyle;
	
	protected Character(CharacterGenerator factory, String type)
	{
		this.genesis = factory;
		
		this.name = genesis.createName();
		this.level = genesis.createLevel();
		this.health = genesis.createHealth();
		this.leftover = genesis.createLeftOvers();
		this.race = genesis.createRace(type);
		this.attackStyle = genesis.createAttackBehavior();
		this.defendStyle = genesis.createDefenseBehavior();
		this.fleeStyle = genesis.createFleeBehavior();
		this.inventory = new ArrayList<Item>();

		
	}

	@Override
	public String toString() {
		return "[genesis=" + genesis + ", name=" + name + ", health="
				+ health + ", race=" + race + ", level=" + level
				+ ", leftover=" + leftover + ", \n\tinventory=" + inventory
				+ ", attackStyle=" + attackStyle + ", defendStyle="
				+ defendStyle + ", fleeStyle=" + fleeStyle + "]";
	}

	public String getName(){
		return name.toString();
	}
	public String getRace(){
		return race.toString();
	}
	public int getHealth(){
		return health.getHitPoints();
	}
	protected void setHealth(int hp){
		health.setHitPoints(hp);
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

	

}
