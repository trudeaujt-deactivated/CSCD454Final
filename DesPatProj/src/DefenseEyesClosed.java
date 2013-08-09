
public class DefenseEyesClosed implements DefenseBehavior {

	@Override
	public double defend() {
		// Will almost guarantee full damage from attack
		
		return 1.0;
	}

	@Override
	public String toString(){
		String str = "EyesClosedDefense..... 100% damage recieved";
		return str;
	}

}
