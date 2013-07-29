import java.util.ArrayList;


public abstract class Character 
{
	protected Name name;
	protected Health health;
	protected Race race;
	protected Level level;
	protected Leftovers leftover;
	
	protected ArrayList<Item> inventory = new ArrayList<Item>();
	protected AttackBehavior attackStyle;
	protected DefenseBehavior defendStyle;
	protected FleeBehavior fleeStyle;
}
