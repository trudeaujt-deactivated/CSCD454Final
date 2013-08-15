public class Mobster extends Character
{
	//recommended behavior(s)  (http://en.wikipedia.org/wiki/Gangster)
	
	
	public Mobster(CharacterGenerator factory, String string)
	{
		super(factory, string);
		inventory.add(new ItemUser());
		inventory.add(new ItemWeapon());
	}

}
	