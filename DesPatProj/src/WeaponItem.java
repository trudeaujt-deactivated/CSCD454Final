import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class WeaponItem 
{
	private Name name;
	private String type;
	private int damagePoints;
	private Name[] titles = {new NameWeak(), new NameAverage(), new NameTough()};
	
	
	public WeaponItem()
	{
		this.name = randomGenerator(titles);
				
		if(name.getClass().isInstance(new NameWeak()))
			this.damagePoints = 3;
		
		if(name.getClass().isInstance(new NameAverage()))
			this.damagePoints = 5;
		
		if(name.getClass().isInstance(new NameTough()))
			this.damagePoints = 8;

		this.type = new NameWeapon().toString();
	}
	

	public int getHitPoints() {
		return damagePoints;
	}


	public Name getName()
	{
		return name;
	}
	
	
	public Name randomGenerator(Name[] titles)
	{
		int index;
		Name rand;
		
		List<Name> names = Arrays.asList(titles);
	    Collections.shuffle(names);
	        
	    index = new Random().nextInt(names.size());
	    rand = names.get(index);

	    System.out.println(index);
	        
		return rand;
	        
	    }
	
	public String toString()
	{
		String str = this.name + " "+this.type+ " "+this.damagePoints;
		return str;
		
	}
	
	
}
