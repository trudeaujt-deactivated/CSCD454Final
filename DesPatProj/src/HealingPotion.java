
public class HealingPotion extends Item 
{
	private Name name;
	private int healPoints;
	
	
	public HealingPotion() {
		this.name = randomGenerator(titles);
				
		if(name.getClass().isInstance(new NameWeak()))
			this.healPoints = 15;
		
		if(name.getClass().isInstance(new NameAverage()))
			this.healPoints = 25;
		
		if(name.getClass().isInstance(new NameTough()))
			this.healPoints = 40;
	}

	public Name getName() {
		return this.name;
	}

	public int getPoints() {
		return this.healPoints;
	}

	public void setHealPoints(int healPoints) {
		this.healPoints = healPoints;
	}

	public int getHealPoints() {
		
		return this.healPoints;
	}

	@Override
	public String toString() {
		return "HealingPotion [name=" + name + ", healPoints=" + getHealPoints()
				+ "]";
	}
	
	
	
}




