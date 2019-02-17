/********************************************************************
 * Address.java
 *
 * Class to define and use a postal address.
 *********************************************************************/

public class Address {
	private String street;		//district, street, building number, etc.
	private String city;		//town, city, etc.
	private String postCode;
	private String country;

	/* Creates a new Address object with 4 parameters
	   parameter st describes the district, street, building number, etc.
	   parameter pcity describes the town, city, etc.
	   parameter zip describes the post code.
	   parameter co describes the country name or code */
	public Address (String st, String pcity, String zip, String co) {
		street = st;
		city = pcity;
		postCode = zip;
		country = co;
	}

	//Returns printable address
	public String toString () {
		return (street + "\n" + postCode + " " + city + "\n" + country);
	}

	public String getStreet () {
		return this.street;
	}
	public void setStreet (String street) {
		this.street = street;
	}
	public String getCity () {
		return this.city;
	}
	public void setCity (String city) {
		this.city = city;
	}
	public String getPostCode () {
		return this.postCode;
	}
	public void setPostCode (String zip) {
		this.postCode = zip;
	}
	public String getCountry () {
		return this.country;
	}
	public void setCountry (String co) {
		this.country = co;
	}
}
