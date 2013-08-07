
import java.util.ArrayList;


public class Hero extends Character 
{
	CharacterGenerator genesis;
	private ArrayList<Character> party = null;
	
	
	public Hero(CharacterGenerator genesis)
	{
		this.genesis = genesis;
		
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
		return "Character [genesis=" + genesis + ", party=" + party + ", name="
				+ name + ", health=" + health + ", race=" + race + ", level="
				+ level + ", leftover=" + leftover + ", getParty()="
				+ getParty() + "]";
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

