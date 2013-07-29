
import java.util.ArrayList;


public class Hero extends Character 
{
	CharacterFactory genesis;
	private ArrayList<Character> party = null;
	
	
	public Hero(CharacterFactory factory)
	{
		this.genesis = factory;
		
		this.name = genesis.createName();
		this.level = genesis.createLevel();
		this.health = genesis.createHealth();
		this.leftover = genesis.createLeftOvers();
		this.race = genesis.createRace();
		this.inventory = new ArrayList<Item>();
		this.party = new ArrayList<Character>();

	}


	@Override
	public String toString() {
		return "Hero [genesis=" + genesis + ", party=" + party + ", name="
				+ name + ", health=" + health + ", race=" + race + ", level="
				+ level + ", leftover=" + leftover + ", getParty()="
				+ getParty() + "]\n\n";
	}


	public ArrayList<Character> getParty() 
	{
		return party;
	}


	public void setParty(Character member) 
	{
		this.party.add(member);
	}

	
}

