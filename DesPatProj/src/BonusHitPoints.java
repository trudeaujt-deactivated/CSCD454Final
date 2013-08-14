

public class BonusHitPoints 
{
	private int bonusPoints = 0;
	
	
	public BonusHitPoints(int bp) {
		this.bonusPoints = bp;
	}
	
	public int getBonusPoints() {
		return this.bonusPoints;
	}
	
	public void setBonusPoints(int bp) {
		this.bonusPoints = bp;
	}
	
	public String toString() {
		return bonusPoints+"";
	}




}