import java.util.Observable;
import java.util.Observer;

public class BadGuy implements Observer
{
    private EyeOfSauron eye;
    private String name;
    private int hobbitsSeen;
    private int elvesSeen;
    private int dwarvesSeen;
    private int menSeen;
    
    public BadGuy(){}
    
    public BadGuy(EyeOfSauron e, String n)
    {
    	this.eye = e;
    	this.name = n;
    	eye.addObserver(this);
    }
    
    public void defeated()
    {
        eye.deleteObserver(this);
    }
    
    public void update(Observable obs, Object arg)
    {
    	if(obs instanceof EyeOfSauron)
    	{
    	    eye = (EyeOfSauron)obs;
    	    this.hobbitsSeen = eye.getHobbits();
    	    this.elvesSeen = eye.getElves();
    	    this.dwarvesSeen = eye.getDwarves();
    	    this.menSeen = eye.getMen();
    	    report();
    	}
    }
    
    private void report()
    {       
    	System.out.println("I, " + name + " can see:");
    	System.out.println(hobbitsSeen + " hobbits");
    	System.out.println(elvesSeen + " elves");
    	System.out.println(dwarvesSeen + " dwarves");
    	System.out.println(menSeen + " men\n\n");
    }
    
}
