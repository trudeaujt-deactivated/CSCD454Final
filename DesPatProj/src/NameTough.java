import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NameTough implements Name 
{

	private String name;
	private String[] titles = {"Worthy","Great","Skillful","Tough","Smart","Big","Strong","Hefty",
						                	"Intimidating","Impressive","Overwhelming", "Worthy", "Powerful",
						                	    "Bad-Ass", "Mighty","Intelligent","Huge","Juggernaut"};
	
	
	public NameTough()
	{
		this.name = randomGenerator(titles);
	}
	
	
	@Override
	public String createName() 
	{
		return this.name;
	}

	@Override
	public String randomGenerator(String[] titles)
	{
		int index;
		String rand;
		
		List<String> names = Arrays.asList(titles);
	    Collections.shuffle(names);
	        
	    index = new Random().nextInt(names.size());
	    rand = names.get(index);
	        
		return rand;
	        
	    }
	
	public String toString()
	{
		return this.name;
	}

}
