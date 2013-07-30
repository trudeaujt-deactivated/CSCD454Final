import java.util.ArrayList;


public class Menace extends Character 
{
	CharacterGenerator genesis;
	
	
	public Menace(CharacterGenerator genesis)
	{
		this.genesis = genesis;
		
		name = genesis.createName();
		level = genesis.createLevel();
		health = genesis.createHealth();
		leftover = genesis.createLeftOvers();
		race = genesis.createRace();
		inventory = new ArrayList<Item>();
	}


	@Override
	public String toString() {
		return "Character [genesis=" + genesis + ", name=" + name + ", health="
				+ health + ", race=" + race + ", level=" + level
				+ ", leftover=" + leftover + "]";
	}


	

	

}