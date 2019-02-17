import java.util.*;

public class driver 
{
	public static void main(String[] args) 
	{
		ArrayList<accountInterface> ai = new ArrayList<accountInterface>();
		
		Scanner klavye = new Scanner(System.in);

		for (;;) 
		{
			System.out.println("Enter command");
			String input = klavye.nextLine();
			String[] arr = input.split(" ");
			
			if (arr[0].equals("create")) 
			{
				int num = Integer.parseInt(arr[3]);
				if (arr[1].equals("PA")) 
				{
					ai.add(new personalAccount(arr[2], num));
				}
				else if (arr[1].equals("CA")) 
				{
					boolean s;
					if(arr[4].equals("true"))
						s = true;
					else
						s = false;
					ai.add(new companyAccount(arr[2], num, s));
				}
				else if (arr[1].equals("SA")) 
				{
					ai.add(new savingAccount(arr[2], num));
				}
			}
			else if (arr[0].equals("report")) 
			{
				if (arr[1].equals("all")) 
				{
					for (int c = 0; c < ai.size(); c++) 
					{
						System.out.println(ai.get(c));
					}
				}
				else
				{
					for (int c = 0; c < ai.size(); c++) 
					{
						int arrInt = Integer.parseInt(arr[1]);
						if (ai.get(c).getID() == arrInt) 
						{
							System.out.println(ai.get(c).toString());
						}
					}
				}
				
			}
			
			else if (arr[0].equals("interest")) 
			{
				if (arr[1].equals("all")) 
				{
					for (int c = 0; c < ai.size(); c++) 
					{
						(ai.get(c)).calculateInterest();
					}
				}
				else
				{
					for (int c = 0; c < ai.size(); c++) 
					{
						int arrInt = Integer.parseInt(arr[1]);
						
						if (ai.get(c).getID() == arrInt) 
						{
							(ai.get(c)).calculateInterest();
						}
					}

				}
				
			} 
			
			else if (arr[0].equals("deposit")) 
			{
				int mon = Integer.parseInt(arr[1]);
				int arrInt = Integer.parseInt(arr[2]);
				
				for (int c = 0; c < ai.size(); c++) 
				{
					if (ai.get(c).getID() == arrInt) 
					{
						ai.get(c).depositMoney(mon);
					}
				}
			} 
			
			else if (arr[0].equals("withdraw")) 
			{
				int mon = Integer.parseInt(arr[1]);
				int arrInt = Integer.parseInt(arr[2]);
				
				for (int c = 0; c < ai.size(); c++) 
				{
					if (ai.get(c).getID() == arrInt) 
					{
						ai.get(c).withdrawMoney(mon);
					}
				}
			} 
			
			else if (arr[0].equals("quit")) 
			{
				System.exit(0);
			}
			
		}

	}

}
