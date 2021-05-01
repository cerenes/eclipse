package inheritanceWork;

public class InstructorManager {

	 public void createCourses(Instructor instructor){
	        System.out.println(instructor.getFirstName());
	        for (String course : instructor.getCourses()) {
	            System.out.println(course + ", baþarýyla oluþturuldu");
	        }
}
}
