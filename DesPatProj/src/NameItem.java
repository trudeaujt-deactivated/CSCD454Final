import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class NameItem implements Name 
{
	
	private String name;
	private String[] items = {"Ring","Attack Scroll", "Amulet", "Lucky Coin", "Attack Gloves", "Pendant",
				                       "Attack Helmet", "Strength Medallion", "Charm", "Talisman", "Token", 
				                       };
			
		public NameItem(){
			this.name = randomGenerator(items);	
		}
		
		
		@Override
		public String createName() {
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
		public String toString(){	
			return this.name.toString();
		}

	}