
public interface CharacterGenerator 
{
	public Health createHealth();
	public Level createLevel();
	public Name createName();
	public Race createRace(String race);
	public AttackBehavior createAttackBehavior();
	public DefenseBehavior createDefenseBehavior();
	public FleeBehavior createFleeBehavior();
	public Leftovers createLeftOvers();
	public abstract String toString();
	
}