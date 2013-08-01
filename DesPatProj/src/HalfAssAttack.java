
public class HalfAssAttack implements AttackBehavior {

	@Override
	public void attack() {
		// This should have a lower range of damage done to opponent
		System.out.println(this);
	}
	@Override
	public String toString(){
		String str = "Half Ass Attack... Half Damage done";
		return str;
	}

}
