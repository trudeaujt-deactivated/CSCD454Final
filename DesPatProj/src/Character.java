import java.util.ArrayList;


public abstract class Character 
{
	Name name;
	Health health;
	Race race;
	Level level;
	Leftovers leftover;
	
	ArrayList<Item> inventory = new ArrayList<Item>();
	AttackBehavior attackStyle;
	DefenseBehavior defendStyle;
	FleeBehavior fleeStyle;
		

	
}
