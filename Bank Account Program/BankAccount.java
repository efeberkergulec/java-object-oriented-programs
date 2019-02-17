/*********************************************************************
 * BankAccount.java                                                  *
 *                                                                   *
 * Class to define a bank account.                                   *
 *********************************************************************/

public class BankAccount {
	public Bank bank;
	public Person owner;
	private double Balance;
	public int accountNumber;
	public static int bankAccountCounter = 0;

	/* Creates a bank with 2 parameters
	   parameter name the bank's name
	   parameter addr the bank's address */
	public BankAccount (Person person, Bank InBank) {
		owner = person;
		bank = InBank;
		bankAccountCounter += 1;
		accountNumber = bankAccountCounter;		
	}

	public Bank getBank () 
	{
		return this.bank;
	}
	public void setBank (Bank Bname) 
	{
		this.bank = Bname;
	}
	public void setOwner (Person newOwner) 
	{
		this.owner = newOwner;
	}
	/* TODO Implement the rest of the methods, such as deposit and withdraw*/
	public void deposit(double deposit)
	{
		this.Balance += deposit; 
	}
	public double getMoney()
	{	
		return Balance;
	}
	public void withdraw(double amount)
	{
		this.Balance -= amount;
	}
	public int getId()
	{
		return accountNumber;
	}
	public void Transfer(BankAccount Sec, int amt)
	{
		this.getBank();
	    Sec.getBank();
		this.deposit(amt);
		Sec.withdraw(amt);
	}
	public String toString()
	{
		return "Account Number " + this.getId() + ": " + this.owner.getName() + ", balance " + this.getMoney();
	}
	public void printThemAll()
	{
		
	}

}