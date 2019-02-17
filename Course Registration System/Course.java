
public class Course 
{
	protected String courseCode;
	protected String courseName;
	protected int year;
	protected String semester;
	protected int capacity;
	public static String myInstructor = "Not assigned yet";
	
	public Course(String courseCode, String courseName, int year, String semester, int capacity) 
	{
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.year = year;
		this.capacity = capacity;
		this.semester = semester;
	}
	public String getCourseCode() 
	{
		return courseCode;
	}
	public void setCourseCode(String courseCode) 
	{
		this.courseCode = courseCode;
	}
	public String getCourseName() 
	{
		return courseName;
	}
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public int getCapacity() 
	{
		return capacity;
	}
	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}
	
	public String getSemester() 
	{
		return semester;
	}
	public void setSemester(String semester) 
	{
		this.semester = semester;
	}
	public void reportCourse() {
		System.out.println(this.getCourseCode() + " - " + this.getCourseName() + " - " + this.getYear() + this.getSemester().toUpperCase());
		System.out.println("Capacity: " + this.getCapacity());
		System.out.println("Lecturer: " + myInstructor);
	}
	
	
}
