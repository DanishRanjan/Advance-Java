import java.util.Iterator;
import java.util.Set;

public class Student {
	int id;
	String n;
	Set<Course> course;
	
	public Student(int id, String n, Set<Course> course) {
		super();
		this.id = id;
		this.n = n;
		this.course = course;
	}

	public String toString(){
		StringBuffer b=new StringBuffer();
		b.append("Name:").append(n).append("\n").append("Course details\n");
		Iterator<Course> itr=course.iterator();
		while(itr.hasNext()){
			b.append(itr.next()).append("\n");
		}
		return b.toString();
	}

}
