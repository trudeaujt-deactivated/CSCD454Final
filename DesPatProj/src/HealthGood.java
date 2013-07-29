
public class HealthGood implements Health
{
	private int hitPoints = 90;
	
	
	public HealthGood()
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

