
public class DefendWell implements DefenseBehavior {

	@Override
	public void defend() {
		// This can reduce the amount of damage sustained from an attack
		System.out.println("DefendWell style defense... 70% damage recieved");
	}

}
