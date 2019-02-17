import java.util.*;

public abstract class AcademicStaff extends Member {
	protected String officeNumber;
	protected String title;
	protected String degree;
	public static boolean temp = true;
	
	ArrayList<Course> memberCourseList = new ArrayList<Course>();

	public AcademicStaff(String name, int id, String officeNum) {
		super(name, id);
		this.officeNumber = officeNum;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public void printInstructor() {
		System.out.println(title + " " + name + " - " + id + " @" + officeNumber);
		for (int count = 0; count < memberCourseList.size(); count++) {
			System.out.println(memberCourseList.get(count).courseCode + " - " + memberCourseList.get(count).courseName);
		}
		System.out.println();
	}
	public void printTeachingAssistant() {
		System.out.println("(" + degree + ") " + name + " - " + id + " @" + this.getOfficeNumber());
		for (int i = 0; i < memberCourseList.size(); i++) {
			System.out.println(memberCourseList.get(i).getCourseCode() + " - " + memberCourseList.get(i).getCourseName());
		}
		System.out.println();
	}
	public void setTeachingAssistantCourse(Course course)
	{
		if (memberCourseList.size() < 3) 
		{
			memberCourseList.add(course);
			System.out.println("success");
		}
		else 
		{
			System.out.println(id + " - " + name + " cannot teach more than 3 courses in this semester");
		}
	}
	public void setInstructorCourse(Course course)
	{
		if(memberCourseList.size() < 3) 
		{
			memberCourseList.add(course);
			Course.myInstructor = title + " " + name;
			System.out.println("success");
		}
		else 
		{
			System.out.println(id + " - " + name + " cannot teach more than 3 courses in this semester");
		}
	}
	public void testRelationship(Course course) {
		for (int count = 0; count < memberCourseList.size(); count++) {
			if (memberCourseList.get(count).equals(course)) {
				System.out.println("Instructor " + Course.myInstructor + " is already teaching " + memberCourseList.get(count).getCourseCode()
						+ " - " + memberCourseList.get(count).getCourseName());
				temp = false;
			}
		}
	}
}
