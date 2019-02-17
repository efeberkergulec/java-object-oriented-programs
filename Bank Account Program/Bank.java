
/********************************************************************
 * Bank.java
 *
 * Class to define a bank.
 *********************************************************************/

public class Bank {
	public String bankName;
	public Address bankAddress;

	/* Creates a bank with 2 parameters
	   parameter name the bank's name
	   parameter addr the bank's address */
	public Bank (String name, Address addr) {
		bankName = name;
		bankAddress = addr;
	}

	public String getName () {
		return this.bankName;
	}
	public void setName (String name) {
		this.bankName = name;
	}
	public Address getAddress () {
		return this.bankAddress;
	}
	public void setAddress (Address addr) {
		this.bankAddress = addr;
	}
}
