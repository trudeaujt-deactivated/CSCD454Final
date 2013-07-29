
public class HealthAverage implements Health
{
private int hitPoints = 60;
	
	
	public HealthAverage()
	{
		this.hitPoints = 60;
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
