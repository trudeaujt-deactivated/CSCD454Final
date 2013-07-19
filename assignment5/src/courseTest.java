
public class courseTest {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] araTest = new Student[3];
		araTest[0] = new Student("First Student");
		araTest[1] = new Student("Second Student");
		araTest[2] = new Student("Third Student");
		
		Course crs = new Course(araTest);
		
		for(Student s : crs)
			System.out.println(s);

	}

}
