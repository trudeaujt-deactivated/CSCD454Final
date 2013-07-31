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
	
	protected Character(CharacterGenerator factory){
		this.genesis = factory;
		
		this.name = genesis.createName();
		this.level = genesis.createLevel();
		this.health = genesis.createHealth();
		this.leftover = genesis.createLeftOvers();
		this.race = genesis.createRace();
		attackStyle = genesis.createAttackBehavior();
		this.inventory = new ArrayList<Item>();

		
	}
	public String toString() {
		return "Character [genesis=" + genesis + ", name=" + name + ", health="
				+ health + ", race=" + race + ", level=" + level
				+ ", leftover=" + leftover + "]";
	}

}
