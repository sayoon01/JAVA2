
public class Student extends Person {
	private long sid;
	private String major;
	
	public Student() {
		super();
		this.sid = -1;
		this.major = "모름";
	}
	
	public Student(String name) {
		super(name);
		this.sid = -1;
		this.major = "모름";
	}
	
	public Student(String name, long sid) {
		super(name);
		this.sid = sid;
		this.major = "모름";
	}
	
	public Student(String name, long sid, String major) {
		super(name);
		this.sid = sid;
		this.major = major;
	}

	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public String printSafely() {
		return ("이름: " + super.getName() + ", 학번: " + sid + ", 전공: " + major);
	}
	
	public String toString() {
		return (super.toString() + ", 학번: " + sid + ", 전공: " + major);
	}
	
	public boolean isTheSame(Student s) {
		if(this.sid == s.sid)
			return true;
		else
			return false;
	}

}