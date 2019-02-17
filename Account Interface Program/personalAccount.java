
public class personalAccount implements accountInterface
{
	private String ownerName; // name of the owner
	private int accountNumber; // assigned account number
	private double money; // the total amount of money in the account
	
	public personalAccount(String oNam, int aNum) 
	{
		this.ownerName = oNam;
		this.accountNumber = aNum;
		this.money = 0;
	}
	
	public int getID()
	{
		return this.accountNumber;
	}
	
	public String getName()
	{
		return this.ownerName;
	}
	
	public double calculateInterest()
	{
		System.out.println("Error");
		return 0;
	}
	
	public void depositMoney(int amount)
	{
		this.money += amount;
	}
	
	public void withdrawMoney(int amount)
	{
		this.money -= amount;
	}
	
	public String toString()
	{
		String print = "Owner Name: " + this.ownerName + "\nAccount Number: " + this.accountNumber + "\nBalance: " + this.money + "\n";
		return print;
	}
}
