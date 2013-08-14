import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random; 



public class NameWeak implements Name 
{

	private String name;
	private String[] titles = {"Weak", "Frail", "Mauled", "Petty", "Small", "Weathered", "Terrible", 
			                     "DumbLittle","Small","UnEven", "Insignificant", "Worthless", "Inadequate",
			                           "Meek","UnStable","Lame", "Bogus","Crappy", "Cheap", "Lousy"};
	
	
	public NameWeak()
	{
		
		this.name = randomGenerator(titles);
	}
	
	
	@Override
	public String createName() 
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
	
	@Override
	public String toString()
	{
		
		return this.name;
	}

}
