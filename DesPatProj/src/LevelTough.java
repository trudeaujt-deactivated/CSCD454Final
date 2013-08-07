
public class LevelTough implements Level
{
	
	private int currLevel = 8;
		
		public LevelTough()
		{
			this.currLevel = 8;
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
