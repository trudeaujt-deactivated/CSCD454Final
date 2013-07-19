import java.util.Iterator;
import java.util.ArrayList;

public class Course implements Iterable<Student> {
	
	public Course() {
		
		this.array = new ArrayList<Student>();
		
	}

	ArrayList<Student> array;
	
	public class ClassIterator implements Iterator<Student> {

		ArrayList<Student> array;
		int index;
		
		public ClassIterator(ArrayList<Student> array) {
			
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
		
		return new ClassIterator(array);
		
	}
	
	public void addStudent(String name, int id) {
		
		Student newStudent = new Student(name, id);
		array.add(newStudent);
		
	}
	
}
