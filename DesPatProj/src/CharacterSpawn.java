public class CharacterSpawn extends CharacterRequest
{
	private String[] classes = {"charlatan","outcast","human","swarmofbees","mobster","firbolg","wolf","menace"}; 
	
	private CharacterGenerator factory = null;
	private Character character = null;

	public Character generate(String type, String power) 
	{
		assert(type != null);
		
		if (type.equalsIgnoreCase("random")) 
		{	
			type = randomGenerator(classes);
		}
		
		if  (type.equalsIgnoreCase("hero")) 
		{
			character = new Hero(new FactoryHero(), "Hero");
			return character;
		}
				
		if(power.equalsIgnoreCase("weak"))
		factory = new FactoryWeak();
		
		if(power.equalsIgnoreCase("average"))
			factory = new FactoryAverage();
		
		if(power.equalsIgnoreCase("tough"))
			factory = new FactoryTough();
		
		if (type.equalsIgnoreCase("wolf")) 
			character = new Wolf(factory, "Wolf");
		
		else if  (type.equalsIgnoreCase("menace")) 
			character = new Menace(factory, "Menace");
		
		else if  (type.equalsIgnoreCase("firbolg")) 
			character = new Firbolg(factory, "Firbolg");
		
		else if  (type.equalsIgnoreCase("mobster")) 
			character = new Mobster(factory, "Mobster");
		
		else if  (type.equalsIgnoreCase("outcast")) 
			character = new Outcast(factory, "Outcast");
		
		else if  (type.equalsIgnoreCase("charlatan")) 
			character = new Charlatan(factory, "Charlatan");
		
		else if  (type.equalsIgnoreCase("human")) 
			character = new Human(factory, "Human");
	
		else if  (type.equalsIgnoreCase("swarmofbees")) 
			character = new SwarmOfBees(factory, "Swarm of Bees");
		else {
			System.out.println("CharacterSpawn else block error"); 
			System.out.println("Type was " + type);
		}
			
		return character;
	}
		
}
	
	