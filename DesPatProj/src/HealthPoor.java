
public class HealthPoor implements Health
{
	private int hitPoints = 30;
	
	
	public HealthPoor()
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
