
public class AddJoin implements Command 
{
	private Character newMember;
	
	
	public AddJoin(Character unaffiliated)
	{
		this.newMember = unaffiliated;
	}
	
	
	@Override
	public void execute() 
	{
		System.out.println(this.newMember + " was added to party.");
	//	this.party.add(this.newMember);
		
		System.out.println("Command DOES NOT WORK.  CHECK THE AddJoin.execute() file to fix!");
		
		
	}
	
	//perform join of a character
	//maybe a chance % probability to join to add another element to join
	
	//getCharactersList() from the room
	//prompt the user to select a non-member from the room
		
	//joinMember = new AddMember(memberParty, character)
	//controller.setCommand(joinMember);
	//controller.sendCommand();

}
