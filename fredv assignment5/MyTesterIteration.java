
public class MyTesterIteration 
{
	public static void main(String[] args)
	{
		Student[] roster  = new Student[3];
		
		Student veteran = new Student("Betty", "Chexout", "31");
		Student newbie = new Student("I.", "Dunn-Poorley", "26"); 
		Student average = new Student("O.I.", "Getzit", "32");
		
		roster[0] = veteran;
		roster[1] = newbie;
		roster[2] = average;
		Course myIt = new Course(roster);
		
		
		for(Student s : myIt)
			System.out.println(s);
	}
	
}
