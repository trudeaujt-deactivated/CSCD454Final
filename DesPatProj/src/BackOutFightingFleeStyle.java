
public class BackOutFightingFleeStyle implements FleeBehavior {

	@Override
	public void flee() {
		// This type of flee behavior can minimize damage and allow more damage done
		System.out.println("BackOutFightingFleeStyle...still gets a turn to attack while fleeing");
		

	}

}
