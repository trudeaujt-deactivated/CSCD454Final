import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class NameRandom implements Name 
{
	
	private Name[] titles = { new NameWeak(), new NameAverage(), new NameTough() };
	private Name name;
	
	public NameRandom() {
		this.name = generator(titles);
	}
	
	
	@Override
	public String toString() {
		return this.name.toString();
	}

	
	private Name generator(Name[] ranks) {
		int index;
		Name rand;
		
		List<Name> names = Arrays.asList(ranks);
	    Collections.shuffle(names);
	        
	    index = new Random().nextInt(names.size());
	    rand = names.get(index);
		        
	    return rand;    
    }


	@Override
	public String randomGenerator(String[] items) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String createName() {
		// TODO Auto-generated method stub
		return null;
	}


}
