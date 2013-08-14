
public class Firbolg extends Character 
{
	
	public Firbolg(CharacterGenerator factory, String string)
	{
		super(factory, string);
		inventory.add(new ItemUser());
		inventory.add(new ItemWeapon());
	}
	
}
