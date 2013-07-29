import java.util.Iterator;
import java.util.ArrayList;

public class Course implements Iterable<Student> {
	
    private ArrayList<Student> array;

    public Course() {
		
		this.array = new ArrayList<Student>();
		
	}

	public class CourseIterator implements Iterator<Student> {

		private ArrayList<Student> array;
		private int index;
		
		public CourseIterator(ArrayList<Student> array) {
			
			this.array = array;
			index = 0;
			
		}

		@Override
		public boolean hasNext() {
			
			return index < array.size();
			
		}

		@Override
		public Student next() {
			
			if(hasNext()) {
				
				Student s = array.get(index);
				++index;
				return s;
				
			}
				
			return null;
			
		}

		@Override
		public void remove() {
			
			// not implemented
			
		}
		
	}
	
	@Override
	public Iterator<Student> iterator() {
		
		return new CourseIterator(array);
		
	}
	
	public void addStudent(String name, int id) {
		
		Student newStudent = new Student(name, id);
		array.add(newStudent);
		
	}
	
}
