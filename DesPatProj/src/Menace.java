public class Menace extends Character 
{
	public Menace(CharacterGenerator genesis, String string)
	{
		super(genesis, string);
		inventory.add(new ItemWeapon());
		inventory.add(new ItemWeapon());

	}
}