
public class LevelHigh implements Level
{
	
	private int currLevel = 5;
		
		public LevelHigh()
		{
			this.currLevel = 5;
		}

		@Override
		public int createLevel() 
		{
			return this.currLevel;
		}

		public int getLevel() 
		{
			// TODO Auto-generated method stub
			return currLevel;
		}


		@Override
		public String toString() 
		{
			return "LevelHigh [currLevel=" + currLevel + "]";
		}
}
