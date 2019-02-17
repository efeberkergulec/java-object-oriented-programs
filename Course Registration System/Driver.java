import java.util.*;
public class Driver 
{	
	public static void main(String[] args) 
	{
		Scanner klavye = new Scanner(System.in);
		
		ArrayList<Course> course = new ArrayList<Course>();		//list for courses
		ArrayList<AcademicStaff> members = new ArrayList<AcademicStaff>();	//list for members including academic staff and students
		
		int courseCounter = 1;
		
		for (;;) 
		{
			String input = klavye.nextLine();

			String[] splitArray = input.split(";");

			if (splitArray[0].equals("exit"))	//closes the program
				System.exit(0);
			
			else if(splitArray[0].equalsIgnoreCase("create"))	//creates tools
			{
				if(splitArray[1].equalsIgnoreCase("Course"))
				{
					int i1 = Integer.parseInt(splitArray[4]);
					int i2 = Integer.parseInt(splitArray[6]);
					course.add(new Course(splitArray[2], splitArray[3], i1, splitArray[5], i2));
					
					if(course.size() > 1)
					{
						for(int i = 1; i < course.size(); i++) 
						{
							if(splitArray[2].equals(course.get(i-1).getCourseCode()))
							{
								System.out.println("A course with code " + splitArray[2] + " already exists.");
								course.remove(course.size()-1);
								break;
							}
						}
						System.out.println("success");
					}						
				}
				else if(splitArray[1].equalsIgnoreCase("Instructor"))
				{
					int i1 = Integer.parseInt(splitArray[3]);
					members.add(new Instructor(splitArray[2], i1, splitArray[4], splitArray[5]));
					
					if (members.size() > 1) 
					{
						for (int i = 1; i < members.size(); i++) 
						{	
							if(i1 == members.get(i-1).getId())
							{
								System.out.println("A person with ID " + i1 + " already exists.");
								members.remove(members.size()-1);
								break;
							}
						}
						System.out.println("success");
					}	
				}
				else if (splitArray[1].equalsIgnoreCase("TA")) {
					int i1 = Integer.parseInt(splitArray[3]);
					for (int i = 1; i < members.size(); i++) {
						if (i1 == members.get(i - 1).getId()) {
							System.out.println("A person with ID " + i1
									+ " already exists.");
							members.remove(members.size()-1);
							break;
						}
						else
							members.add(new TeachingAssistant(splitArray[2], i1, splitArray[4], splitArray[5]));
					}
					System.out.println("success");
				}
			}
			else if(splitArray[0].equalsIgnoreCase("assign"))	//assigns Academic Staff members to course
			{
				for (int i = 0; i < course.size(); i++)
				{
					if (course.get(i).getCourseCode().equals(splitArray[3])) 
					{
						courseCounter = i;
					}
				}
				if(splitArray[1].equalsIgnoreCase("Instructor"))
				{
					for (int i = 0; i < members.size(); i++)
					{
						members.get(i).testRelationship(course.get(courseCounter));
					}
					for (int i = 0; i < members.size(); i++) 
					{
						if (Instructor.temp) 
						{
							if (members.get(i).getId() == Integer.parseInt(splitArray[2])) 
							{
								members.get(i).setInstructorCourse(course.get(courseCounter));
							}
						}
					}
				}
				else if(splitArray[1].equalsIgnoreCase("TA"))
				{
					for (int i = 0; i < members.size(); i++) 
					{
						if (members.get(i).getId() == Integer.parseInt(splitArray[2])) 
						{
							members.get(i).setInstructorCourse(course.get(courseCounter));
						}
					}
				}
			}
			else if(splitArray[0].equalsIgnoreCase("report"))	//prints the profiles of Academic Staff
			{
				if(splitArray[1].equalsIgnoreCase("Course"))
				{
					
					for(int c = 0; c < course.size(); c++) 
					{						
						if(splitArray[2].equals(course.get(c).getCourseCode()))
						{
							course.get(c).reportCourse();
						}
					}
				}
				else if(splitArray[1].equalsIgnoreCase("Instructor"))
				{
					int i1 = Integer.parseInt(splitArray[2]);
					
					for (int i = 0; i < members.size(); i++) 
					{
						if(i1 == members.get(i).getId())
						{
							members.get(i).printInstructor();
						}
					}
				}
				else if(splitArray[1].equalsIgnoreCase("TA"))
				{
					int i1 = Integer.parseInt(splitArray[2]);
					for (int i = 1; i < members.size(); i++) 
		            {
						if(i1 == members.get(i).getId())
						{
							members.get(i-1).printTeachingAssistant();
						}
					}
				}
			}
			else
				System.out.println("Unknown command");
		}
	}
}
