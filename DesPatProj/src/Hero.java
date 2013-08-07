
import java.util.ArrayList;


public class Hero extends Character 
{
	private ArrayList<Character> party = null;
	
	public Hero(CharacterGenerator genesis)
	{
		super(genesis);
	}


	public ArrayList<Character> getParty() 
	{
		return party;
	}


	public void setParty(Character member) 
	{
		this.party.add(member);
	}

	
}

