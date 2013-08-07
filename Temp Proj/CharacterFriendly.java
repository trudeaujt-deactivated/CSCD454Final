import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CharacterFriendly extends CharacterRequest
{
	private String[] classes = {"hero","charlatan","outcast","human","swarmofbees","mobster","firbolg","wolf","menace"}; 
	private CharacterGenerator[] rank = {new FactoryAverage(), new FactoryWeak(), new FactoryTough()};
	
	private CharacterGenerator factory = null;
	private Character character = null;

	@Override
	protected Character generate(String type) 
	{
		if  (type.equalsIgnoreCase("hero")) 
		{
			character = new Hero(new FactoryHero());
			return character;
		}
		
		if (type.equalsIgnoreCase("random")) 
		{	
			factory = rankGenerator(rank); 
			type = randomGenerator(classes);
		}
		
		if (type.equalsIgnoreCase("wolf")) 
		{
			factory = rankGenerator(rank); 
			character = new Wolf(factory);
		}
			
		if  (type.equalsIgnoreCase("menace")) 
		{	
			factory = rankGenerator(rank); 
			character = new Menace(factory);
		}
		
		if  (type.equalsIgnoreCase("firbolg")) 
		{	
			factory = rankGenerator(rank); 
			character = new Firbolg(factory);
		}
		
		if  (type.equalsIgnoreCase("mobster")) 
		{	
			factory = rankGenerator(rank); 
			character = new Mobster(factory);
		}
		
		if  (type.equalsIgnoreCase("outcast")) 
		{	
			factory = rankGenerator(rank); 
			character = new Outcast(factory);
		}
		
		if  (type.equalsIgnoreCase("charlatan")) 
		{	
			factory = rankGenerator(rank); 
			character = new Charlatan(factory);
		}
		
		if  (type.equalsIgnoreCase("human")) 
		{	
			factory = rankGenerator(rank); 
			character = new Human(factory);
		}
	
		if  (type.equalsIgnoreCase("swarmofbees")) 
		{	
			factory = rankGenerator(rank); 
			character = new SwarmOfBees(factory);
		}
	
		return character;
	}
	
	protected CharacterGenerator rankGenerator(CharacterGenerator[] factoryNames) 
	{
		
		int index;
		CharacterGenerator rand;
		
		List<CharacterGenerator> factoryList = Arrays.asList(factoryNames);
	    Collections.shuffle(factoryList);
	        
	    index = new Random().nextInt(factoryList.size());
	    rand = factoryList.get(index);
	        
		return rand;	
	}
		
}
	
	