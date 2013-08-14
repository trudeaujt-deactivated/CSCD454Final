public class Human extends Character 
{
	public Human(CharacterGenerator factory, String string)
	{
		super(factory, string);
		inventory.add(new HealingPotion());
		inventory.add(new ItemWeapon());
	}
}