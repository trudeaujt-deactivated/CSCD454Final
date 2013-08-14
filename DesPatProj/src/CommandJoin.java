
public class CommandJoin extends Command
{
	//private Character newMember;
	
	public CommandJoin(GameControllerInterface gci)
	{
		controller = gci;
		commandString = "join";
	}
	
	
	@Override
	public void execute() 
	{
		controller.setWindowText("Member" + " was added to party.");
	//	this.party.add(this.newMember);
		
		controller.setWindowText("Command DOES NOT WORK.  CHECK THE CommandJoin.execute() file to fix!");
		controller.setWindowText("Need to  hero reference handy to add new member.");

		
	}
	
	//perform join of a character
	//maybe a chance % probability to join to add another element to join
	
	//getCharactersList() from the room
	//prompt the user to select a non-member from the room
		
	//joinMember = new AddMember(memberParty, character)
	//controller.setCommand(joinMember);
	//controller.sendCommand();

}
