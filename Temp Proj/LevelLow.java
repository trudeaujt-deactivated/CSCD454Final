
public class LevelLow implements Level
{
	private int currLevel = 1;
	
	public LevelLow()
	{
		this.currLevel = 1;
	}

	@Override
	public int createLevel() 
	{
		return this.currLevel;
	}

	public int getLevel() 
	{

		return currLevel;
	}

	@Override
	public String toString() {
		return "LevelLow [currLevel=" + currLevel + "]";
	}
	
	

}
