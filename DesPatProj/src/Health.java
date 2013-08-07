
public abstract class Health
{
	protected int hitPoints;
	

	public abstract int createHealth();
	public void setHitPoints(int hp){
		hitPoints = hp;
	}
	public int decrementHitPoints(int value){
		hitPoints -= value;
		return hitPoints;
	}
	public int incrementHitPoints(int value){
		hitPoints += value;
		return hitPoints;
	}
	public int getHitPoints(){
		return hitPoints;
	}
	public String toString()
	{
		return hitPoints+"";
	}

}
