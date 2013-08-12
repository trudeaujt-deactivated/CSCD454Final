
public interface AttackBehavior 
{
	public int attack(PartyMember attacker, PartyMember otherCharacter);
	AttackBehavior[] attackArray = {new AttackHalfAss(), new AttackAggressive()};
	
}
