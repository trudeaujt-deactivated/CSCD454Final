
public class TurnTailFleeStyle implements FleeBehavior {

	@Override
	public void flee() {
		// This will allow the character to sustain more damage while fleeing
		System.out.println(this);
	}
	@Override
	public String toString(){
		String str = "TurnTailFleeStyle....still receives damage..no turn to attack";
		return str;
	}


}
