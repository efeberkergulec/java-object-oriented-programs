
/********************************************************************
 * Person.java
 *
 * Class to define a person.
 *********************************************************************/

public class Person {
	private String firstName, lastName;
	private Address homeAddress, workAddress;
	private String birthday;

	/* Creates a person with 5 parameters
	   parameter first the person's first name
	   parameter last the person's last name
	   parameter home the person's home address
	   parameter work the person's work address
	   parameter dob the person's date of birth */
	public Person (String first, String last, Address home, Address work, String dob) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		workAddress = work;
		birthday = dob;
	}

	public String toString () {
		String info = "Name: " + firstName + " " + lastName + " (" + birthday + ")\n";
		info += "Home Address: " + homeAddress + "\n";
		info += "Work Address: " + workAddress;
		return info;
	}

	public String getName () {
		return firstName + " " + lastName;
	}
	public Address getHomeAddress () {
		return this.homeAddress;
	}
	public void setHomeAddress (Address home) {
		this.homeAddress = home;
	}
	public Address getWorkAddress () {
		return this.workAddress;
	}
	public void setWorkAddress (Address work) {
		this.workAddress = work;
	}
}
