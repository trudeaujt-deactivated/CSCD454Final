/**
 * A tester for the Course class. Shows that Course implements iterable, using a 'for each' loop.
 * 
 * @author Jonathan Trudeau
 * @author Fred Vela
 * @author Adam Bortfeld
 */
public class CourseTester {

	public static void main(String [] arguments) {
		
		Course course = new Course();
		course.addStudent("Stu", 123);
		course.addStudent("Tom", 456);
		
		for(Student s : course)
			System.out.println(s.toString());
		
	}
	
}
