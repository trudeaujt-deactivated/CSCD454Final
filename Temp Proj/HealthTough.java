
public class HealthTough extends Health
{
	public HealthTough()
	{
		this.hitPoints = 90;
	}
	@Override
	public int createHealth() 
	{
		return  hitPoints;
	}
}

