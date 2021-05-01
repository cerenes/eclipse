package inheritanceWork;

public class Main {

	public static void main(String[] args) {
		    String[] courses = {"C# / Angular", "Java / React"};
	        Instructor instructor = new Instructor();
	        Student student = new Student();
	        InstructorManager instructorManager = new InstructorManager();
	        StudentManager studentManager = new StudentManager();

	        instructor.setId(1);
	        instructor.setFirstName("Engin");
	        instructor.setLastName("Demiroğ");
	        instructor.setEmail("engin@engin.com");
	        instructor.setPassword("12345");
	        instructor.setCourses(courses);

	        student.setId(2);
	        student.setFirstName("Ceren");
	        student.setLastName("Esirgenci");
	        student.setEmail("ceren@ceren.com");
	        student.setPassword("1234567");
	        student.setCourses(courses);
	        student.setAddress("İzmir, Türkiye");

	        instructorManager.createCourses(instructor);
	        System.out.println("--------------------");
	        studentManager.registerCourses(student);

	}

}
