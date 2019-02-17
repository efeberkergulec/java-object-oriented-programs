
public interface accountInterface 
{
	public final double RATE = 0.18;

	public int getID();
	public String getName();

	public double calculateInterest();
	public void depositMoney(int amount);
	public void withdrawMoney(int amount);
	String toString();
}