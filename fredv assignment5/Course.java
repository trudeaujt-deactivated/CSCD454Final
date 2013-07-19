import java.util.Iterator;


public class Course implements Iterable<Student>
{
	
	public class CourseIterator implements Iterator<Student> 
	{
		private Student[] list;// = new Student[2];
		int currIndex = 0;
		
		public CourseIterator(Student[] roster) 
		{

			this.list = roster;
			this.currIndex = 0;
		}

		
		@Override
		public boolean hasNext() 
		{

			return currIndex < list.length;
		}

		@Override
		public Student next() 
		{
		//	if(hasNext())
			
			//	currIndex++;
			return list[currIndex++];
			
		}
			
		
		

		@Override
		public void remove()
		{

			
		}

	}

	private Student[] iter_ara;// = new Student[];
	
	
	@Override
	public Iterator<Student>iterator() 
	{
		return new CourseIterator(iter_ara);
	}
	
	
	public Course(Student[] roster)
	{
		this.iter_ara = roster;
	}
	

}
