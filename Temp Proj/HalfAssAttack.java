
public class HalfAssAttack implements AttackBehavior {

	private final int halfassDamage = 6;
	
	@Override
	public int attack(PartyMember otherCharacter) {
		// This should have a lower range of damage done to opponent
		return (int) Math.round(halfassDamage * otherCharacter.character.defendStyle.defend());
		
	}
	@Override
	public String toString(){
		String str = "Half Ass Attack... Half Damage done";
		return str;
	}

}
