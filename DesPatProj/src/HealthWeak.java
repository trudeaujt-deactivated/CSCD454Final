
public class HealthWeak extends Health
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

}
