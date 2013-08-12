
public class NullCommand extends Command2 {
	
	public NullCommand(){
	commandString = "no command";
	}
	
	@Override
	public void execute() {
		System.out.println("What?");
	}

}
