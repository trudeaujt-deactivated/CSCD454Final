
public class HealthTough implements Health
{
	private int hitPoints = 90;
	
	
	public HealthTough()
	{
		this.hitPoints = 90;
	}
	@Override
	public int createHealth() 
	{
		return  hitPoints;
	}
	
	public String toString()
	{
		return hitPoints+"";
	}
}

