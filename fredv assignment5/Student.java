
public class Student 
{

	private String first;
	private String last;
	private String age;
	
	
	
	public Student(String first, String last, String age) 
	{
		
		this.first = first;
		this.last = last;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() 
	{
		
		return first  +" "+  last +" "+  age;	
	}
	
}
