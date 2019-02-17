
public class companyAccount implements accountInterface
{
	private String companyName; // name of the owner
	private int accountNumber; // assigned account number
	private double money; // the total amount of money in the account
	private boolean taxStatus; //look at calculateInterest for details
	
	public companyAccount(String cName, int aNum, boolean taxStat) 
	{
		this.companyName = cName;
		this.accountNumber = aNum;
		this.taxStatus = taxStat;
		money = 0;
	}
	
	public int getID()
	{
		return this.accountNumber;
	}
	
	public String getName()
	{
		return this.companyName;
	}
	
	public double calculateInterest()
	{
		if(taxStatus == true)
			return money += (money * RATE)  - 100;
		else
			return money += (money * RATE);
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
		if(taxStatus == true)
			return "Company Name: " + companyName + "\nAccount Number: " + accountNumber + "\nTax Status: 100TL\nBalance: " + money + "\n";
		else if(taxStatus == false)
			return "Company Name: " + companyName + "\nAccount Number: " + accountNumber + "\nTax Status: no tax\nBalance : " + money + "\n";
		return "";
	}
}
