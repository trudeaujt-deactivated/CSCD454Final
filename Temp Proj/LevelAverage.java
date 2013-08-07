
public class LevelAverage implements Level {
	
	private int currLevel = 4;
		
		public LevelAverage()
		{
			this.currLevel = 4;
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
			return "LevelAverage [currLevel=" + currLevel + "]";
		}
}