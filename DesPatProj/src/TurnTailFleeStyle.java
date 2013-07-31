
public class TurnTailFleeStyle implements FleeBehavior {

	@Override
	public void flee() {
		// This will allow the character to sustain more damage while fleeing
		System.out.println("TurnTailFleeStyle....still receives damage..no turn to attack");
	}

}
