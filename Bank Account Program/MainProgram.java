import java.util.*;

public class MainProgram 
{
	public static void main(String[] args)
	{	
		String trans = "";
		int idNumber = 0, idNumber1 = 0, idNumber2 = 0; 
		double value = 0.0;
		String s = "";
		
		Scanner scan = new Scanner(System.in);
		Address ad = new Address(s, s, s, s);
		Bank b = new Bank(s, ad);
		Bank a = new Bank(s, ad);
		Bank c = new Bank(s, ad);
		
		Person jane1 = new Person("Jane", "Smith", ad, ad, s);
		Person ed = new Person("Edward", "Demsey", ad, ad, s);
		Person ted = new Person("Ted", "Murphy", ad, ad, s);
		Person john = new Person("John", "White", ad, ad, s);
		Person jane2 = new Person("Jane", "Smith", ad, ad, s);
		
		BankAccount t1 = new BankAccount(jane1, a);
		BankAccount t2 = new BankAccount(ed, a);
		BankAccount t3= new BankAccount(ted, b);
		BankAccount t4 = new BankAccount(john, b);
		BankAccount t5 = new BankAccount(jane2, c);
		
		t1.deposit(250.00);
		t2.deposit(140.00);
		t3.deposit(100.00);
		t4.deposit(120.00);
		t5.deposit(150.00);

		ArrayList<BankAccount> arrList = new ArrayList<BankAccount>();
		arrList.add(t1);
		arrList.add(t2);
		arrList.add(t3);
		arrList.add(t4);
		arrList.add(t5);
		
		String input = "";
		
		while(!(input.equals("q")))
		{
			input = scan.nextLine();
			String[] command = input.split(" ");
			
			if(command.length == 1)
			{
				for (BankAccount account : arrList) {	
					System.out.println(account);
				}
			}
			else if(command.length == 3)
			{
				trans = command[0];
				idNumber = Integer.parseInt(command[1]);
				value = Double.parseDouble(command[2]);
			}
			else if(command.length == 4)
			{				
				idNumber1 = Integer.parseInt(command[0]);
				idNumber2 = Integer.parseInt(command[1]);
				trans = command[2];
				value = Double.parseDouble(command[3]);
			}
			
			switch(trans)
			{
			case "d":
				arrList.get(idNumber - 1).deposit(value);
				break;
			case "w":
				arrList.get(idNumber - 1).withdraw(value);
				break;
			case "t":
				arrList.get(idNumber2 - 1).deposit(value);
				arrList.get(idNumber1 - 1).withdraw(value);
				break;
			case "account_number":
				arrList.get(idNumber - 1).getId();
				break;
			case "amount":
				arrList.get(idNumber - 1).getMoney();
				break;
			}
			
		}
		
	}

}