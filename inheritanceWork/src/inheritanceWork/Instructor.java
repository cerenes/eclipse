package inheritanceWork;

public class Instructor extends User {
	private String[] courses;
	
	public Instructor() {
		 
	 }

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

}
