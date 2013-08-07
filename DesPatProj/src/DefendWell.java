
public class DefendWell implements DefenseBehavior {

	@Override
	public double defend() {
		// This can reduce the amount of damage sustained from an attack
		
		return .70;
		
	}
	@Override
	public String toString(){
		String str = "DefendWell style defense... 70% damage recieved";
		return str;
	}

}
