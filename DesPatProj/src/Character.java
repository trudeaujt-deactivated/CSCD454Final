import java.util.ArrayList;


public abstract class Character 
{
	String name;
	int health;
	String race;
	int level;
	ArrayList<Item> inventory;
	
	abstract void makeCharacter();
	
	
	public String getName()
	{
		
		return this.name;
	}
	
	
	public void setName(String name)
	{
		
		this.name = name;
	}
	
	
	
	public int getHealth() 
	{
	
		return this.health;
	}


	public void setHealth(int health) 
	{
		
		this.health = health;
	}


	public int getLevel() 
	{
		
		return this.level;
	}


	public void setLevel(int level) 
	{
		
		this.level = level;
	}


	public void setInventory(String item) 
	{
		
	//	inventory.add(item);
	}
	
	
	public void printInventory()
	{
		int x = 0;
		String str1 = "";
		
		
		
		
		System.out.println(str1);
	}
	
	
	public String toString()
	{
		
		return "I am "+getName()+".\n"+" I have "+getHealth()+ " hit points.\n"+"  I am a level "+getLevel()+" character.\n";
	}
	
	
}
