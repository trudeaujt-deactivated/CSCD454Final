
public class HealthWeak implements Health
{
	private int hitPoints = 30;
	
	
	public HealthWeak()
	{
		this.hitPoints = 30;
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
