import java.util.ArrayList;


public class Charlatan extends Character 
{
	CharacterGenerator genesis;


//recommended behavior(s)  (http://en.wikipedia.org/wiki/Charlatan)

public Charlatan(CharacterGenerator factory)
{
	this.genesis = factory;
	
	this.name = genesis.createName();
	this.level = genesis.createLevel();
	this.health = genesis.createHealth();
	this.leftover = genesis.createLeftOvers();
	this.race = genesis.createRace();
	this.inventory = new ArrayList<Item>();

}


@Override
public String toString() {
	return "Character [genesis=" + genesis + ", name=" + name + ", health="
			+ health + ", race=" + race + ", level=" + level
			+ ", leftover=" + leftover + "]";
}


}