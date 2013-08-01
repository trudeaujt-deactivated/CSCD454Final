
public class EyesClosedDefense implements DefenseBehavior {

	@Override
	public void defend() {
		// Will almost guarantee full damage from attack
		System.out.println(this);
	}

	@Override
	public String toString(){
		String str = "EyesClosedDefense..... 1000% damage recieved";
		return str;
	}

}
