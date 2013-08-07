
public class HealthAverage extends Health
{
	public HealthAverage()
	{
		this.hitPoints = 60;
	}
	@Override
	public int createHealth() 
	{
		return  hitPoints;
	}

}
