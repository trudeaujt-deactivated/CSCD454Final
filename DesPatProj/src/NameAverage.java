import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class NameAverage implements Name 
{

	private String name;
	private String[] titles = {"Normal","Average", "Ordinary", "Mundane", "Plain", "Medium", "Mediocre", 
									"Capable", "Basic", "Common", "Simple", "Regular",
										    "Middle-Of-The-Road","Okay", "Fair","Adequate"};



	public NameAverage()
	{
		this.name = randomGenerator(titles);
	}
	
	@Override
	public String createName() 
	{
	
		return this.name;
	}
	
	@Override
	public String toString()
	{
		
		return this.name;
	}

	@Override
	public String randomGenerator(String[] values)
	{
		int index;
		String rand;
		
		List<String> names = Arrays.asList(values);
	    Collections.shuffle(names);
	        
	    index = new Random().nextInt(names.size());
	    rand = names.get(index);
	        
		return rand;
	        
	}


}


	
	
	
	
	


