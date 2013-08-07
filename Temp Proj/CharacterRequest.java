import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public abstract class CharacterRequest 
{
	
	public Character requestCharacter(String type)
	{
		
		Character character;
		character = generate(type);
		
		return character;
	}
	
	protected abstract Character generate(String type);
	
	
	
	
	protected String randomGenerator(String[] values)
	{
		
		int index;
		String randName;
		
		List<String> namesList = Arrays.asList(values);
	    Collections.shuffle(namesList);
	        
	    index = new Random().nextInt(namesList.size());
	    randName = namesList.get(index);
	        
		return randName;
	}
	

		

}
