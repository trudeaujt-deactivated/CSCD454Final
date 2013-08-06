
public class HealthWeak extends Health
{
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
