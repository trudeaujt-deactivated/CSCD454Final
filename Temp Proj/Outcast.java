import java.util.ArrayList;


public class Outcast extends Character 
{
	CharacterGenerator genesis;
	
	
	
	public Outcast(CharacterGenerator factory)
	{
		this.genesis = factory;
		
		name = genesis.createName();
		level = genesis.createLevel();
		health = genesis.createHealth();
		leftover = genesis.createLeftOvers();
		race = genesis.createRace();
		inventory = new ArrayList<Item>();
	}


	@Override
	public String toString() {
		return "Character  [genesis=" + genesis + ", name=" + name + ", health="
				+ health + ", race=" + race + ", level=" + level
				+ ", leftover=" + leftover + "]";
	}
}
