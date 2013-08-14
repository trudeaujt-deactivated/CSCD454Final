public class DisplayHelp extends Command 
{	

	public DisplayHelp(GameControllerInterface gci)
	{
		controller = gci;
		this.commandString = "help";
		
	}
	
	@Override
	public void execute() 
	{
		controller.setWindowText("\n\n\n"+
		"change defense"+
		"\tchange attack"+
		"\tchange flee"+
		"\tchange weapon\n\n"+
	    "move north"+
		"\tmove south"+
		"\tmove east"+
		"\tmove west\n\n"+
		

		"flee north"+
		"\tflee south"+
		"\tflee east"+
		"\tflee west\n\n"+

		"move north"+
		"\tmove south"+
		"\tmove east"+
		"\tmove west\n\n"+

		"join"+
		"\t\tsearch room"+
		"\tpickup"+
		"\t\tattack\n\n"+
		"\thelp\n\n");

	}

}
