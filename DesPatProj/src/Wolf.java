public class Wolf extends Character 
{
	public Wolf(CharacterGenerator factory, String string)
	{
		super(factory, string);
		inventory.add(new ItemUser());
	}

}
