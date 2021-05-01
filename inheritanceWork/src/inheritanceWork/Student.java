package inheritanceWork;

public class Student extends User {
	 private String[] courses;
	 private String address;
	 
	 public Student() {
		 
	 }
	 
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
