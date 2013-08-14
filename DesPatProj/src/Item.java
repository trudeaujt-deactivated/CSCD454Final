import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public abstract class Item 
{
	public abstract Name getName();
	public abstract int getPoints();
	
	protected Name[] titles = { new NameWeak(), new NameAverage(), new NameTough() };

	
	
	public Name randomGenerator(Name[] titles) 
	{
		int index;
		Name rand;
		
		List<Name> names = Arrays.asList(titles);
	    Collections.shuffle(names);
	        
	    index = new Random().nextInt(names.size());
	    rand = names.get(index);
	    
	    return rand;
        
    }
	
}
