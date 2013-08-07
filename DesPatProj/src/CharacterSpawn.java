import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CharacterSpawn extends CharacterRequest
{
	private String[] classes = {"hero","charlatan","outcast","human","swarmofbees","mobster","firbolg","wolf","menace"}; 
	private CharacterGenerator[] rank = {new FactoryAverage(), new FactoryWeak(), new FactoryTough()};
	
	private CharacterGenerator factory = null;
	private Character character = null;

	@Override
	protected Character generate(String type) 
	{
		assert(type != null);
		
		if (type.equalsIgnoreCase("random")) 
		{	
			factory = rankGenerator(rank); 
			type = randomGenerator(classes);
		}
		
		if  (type.equalsIgnoreCase("hero")) 
		{
			character = new Hero(new FactoryHero());
			return character;
		}
		factory = rankGenerator(rank);
		
		
		if (type.equalsIgnoreCase("wolf")) 
			character = new Wolf(factory);
			
		else if  (type.equalsIgnoreCase("menace")) 
			character = new Menace(factory);
		
		else if  (type.equalsIgnoreCase("firbolg")) 
			character = new Firbolg(factory);
		
		else if  (type.equalsIgnoreCase("mobster")) 
			character = new Mobster(factory);
		
		else if  (type.equalsIgnoreCase("outcast")) 
			character = new Outcast(factory);
		
		else if  (type.equalsIgnoreCase("charlatan")) 
			character = new Charlatan(factory);
		
		else if  (type.equalsIgnoreCase("human")) 
			character = new Human(factory);
	
		else if  (type.equalsIgnoreCase("swarmofbees")) 
			character = new SwarmOfBees(factory);
		else {
			System.out.println("CharacterSpawn else block error"); 
			System.out.println("Type was " + type);
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
	
	