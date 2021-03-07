public class Course {
	String name;
	int fee;
	public Course(String name, int fee) {
		super();
		this.name = name;
		this.fee = fee;
	}
	public String toString(){
		StringBuffer b=new StringBuffer();
		b.append(name).append("\t\t").append(fee);
		return b.toString();
	}

}
