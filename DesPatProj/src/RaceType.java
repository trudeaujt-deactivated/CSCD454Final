import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class RaceType implements Race 
{
	private String raceName;
	private String[] raceType = {"Charlatan","Outcast","Human","SwarmOfBees",
												"Mobster","Firbolg","Wolf","Menace"};
	
	
	public RaceType()
	{
		
		this.raceName = randomGenerator(raceType);
	}
	
	
	
	public String getRaceName() 
	{
		return raceName;
	}



	@Override
	public String createRace() 
	{

		return this.raceName;
	}
	
	
	
	private String randomGenerator(String[] values)
	{
		int index;
		String rand;
		
		List<String> names = Arrays.asList(values);
	    Collections.shuffle(names);
	        
	    index = new Random().nextInt(names.size());
	    rand = names.get(index);
	        
		return rand;
	        
	}
	
	public String toString()
	{
		return this.raceName;
	}

}
