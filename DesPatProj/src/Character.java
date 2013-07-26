import java.util.ArrayList;


public abstract class Character 
{
	Name name;
	Health health;
	Race race;
	Level level;
	
	ArrayList<Item> inventory;
	AttackBehavior attackStyle;
	DefenseBehavior defendStyle;
	FleeBehavior fleeStyle;
	
	abstract void makeCharacter();
	
	
	public String getName()
	{
		return this.name.toString();
	}
	
	
	public void setName(Name name)
	{
		
		this.name = name;
	}
	
	
	
	public Health getHealth() 
	{
	
		return this.health;
	}


	public void setHealth(Health health) 
	{
		
		this.health = health;
	}


	public Level getLevel() 
	{
		
		return this.level;
	}


	public void setLevel(Level level) 
	{
		
		this.level = level;
	}


	public void setInventory(String item) 
	{
		
	//	inventory.add(item);
	}
	
	
	public void printInventory()
	{
		
		for(Item item : inventory)
		
		System.out.println(item+ " ");
	}
	
	
	public String toString()
	{
		
		return "I am "+getName()+".\n"+" I have "+getHealth()+ " hit points.\n"+"  I am a level "+getLevel()+" character.\n";
	}
	
	
}
