public class Charlatan extends Character
{
	//recommended behavior(s)  (http://en.wikipedia.org/wiki/Charlatan)

	public Charlatan(CharacterGenerator factory, String string)
	{
		super(factory, string);
		inventory.add(new HealingPotion());
		inventory.add(new HealingPotion());

	}

}