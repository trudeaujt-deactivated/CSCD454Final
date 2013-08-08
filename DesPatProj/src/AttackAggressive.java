
public class AttackAggressive implements AttackBehavior 
{
	private final int aggressiveDamage = 10;
	
	@Override
	public int attack(PartyMember otherCharacter) {
		
		// this will affect what percentage of damage is done to the opponent
		
		return (int) Math.round(aggressiveDamage * otherCharacter.character.defendStyle.defend());
		
	}
	@Override
	public String toString(){
		String str = "Aggressive Attack Style...maximum damage done";
		return str;
	}

}
