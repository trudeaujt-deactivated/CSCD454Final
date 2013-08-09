
public class CommandTest
{
	
	public static void main(String[] args) 
	{
		ChangeAttack changeAttack;
		ChangeDefense changeDefense;
		ChangeFlee changeFlee;
		
		CommandCenter box = new CommandCenter();
		Character character = new Wolf(new FactoryWeak(), "Wolf");   //create a wolf

		changeAttack = new ChangeAttack(new AttackAggressive(), character);  //define a new change
		changeDefense = new ChangeDefense(new DefenseWell(), character);
		changeFlee = new ChangeFlee(new FleeBackOutFighting(), character);

		
		
		System.out.println("Before change");

		System.out.println(character);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		
		box.setCommand(changeAttack); //swap out attack;  
		box.sendCommand(); // the set.Command encapsulates the change, doesn't care about command itself; just calls execute
		
		box.setCommand(changeDefense);//swap out defense
		box.sendCommand();
		
		box.setCommand(changeFlee);//swap out flee
		box.sendCommand();
		
		
		System.out.println("After change");

		System.out.println(character);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


		
	}	

}
