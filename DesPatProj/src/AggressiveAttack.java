
public class AggressiveAttack implements AttackBehavior {

	@Override
	public void attack() {
		
		// this will affect what percentage of damage is done to the opponent
		System.out.println(this);
	}
	@Override
	public String toString(){
		String str = "Aggressive Attack Style...maximum damage done";
		return str;
	}

}
