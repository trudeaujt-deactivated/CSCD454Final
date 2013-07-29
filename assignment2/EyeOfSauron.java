import java.util.Observable;
import java.util.Observer;

public class EyeOfSauron extends Observable
{
    private int hobbits;
    private int elves;
    private int dwarves;
    private int men;

    public EyeOfSauron(){}

    public void enemyChange()
    {
    	setChanged();
    	notifyObservers();
    }
    
    public void setEnemies(int h, int e, int d, int m)
    {
    	this.hobbits = h;
    	this.elves = e;
    	this.dwarves = d;
    	this.men = m;
    	enemyChange();
    }

    public int getHobbits() {return hobbits;}
    public int getElves() {return elves;}
    public int getDwarves() {return dwarves;}
    public int getMen() {return men;}
    
}
