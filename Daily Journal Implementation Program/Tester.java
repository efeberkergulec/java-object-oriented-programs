import java.util.*;
public class Tester 
{
    public static void main(String[] args) 
    {
    	String mainInput, loopInput = "";
    	
    	Scanner scan = new Scanner(System.in);
    	
    	ArrayList<Time> timeList = new ArrayList<Time>();
    	ArrayList<String> activityList = new ArrayList<String>();
    	
    	System.out.println("Please enter the time you wake up");
    	mainInput = scan.nextLine();
    	
    	Time m = new Time(mainInput);
    	
    	int len = mainInput.length();
    	
    	m.toString();
    	
    	if(len == 4 || len == 5)
    	{
    		m.toAMPM(mainInput);
    	}
    	else if(len >= 21 && len <= 23)
    	{
    		m.eliminateVerbose(mainInput);
    		m.toAMPM(mainInput);
    	}
    	timeList.add(m);
    	activityList.add("Woke up");
    	
    	while(loopInput != "done")
    	{
    		
    		System.out.println("Please enter your next activity:");
    		loopInput = scan.nextLine();
    		Time l = new Time(loopInput);
    		String[] list = loopInput.split(" ", 2);

    		if(list[0].equals("done"))
    		{
    			System.out.println(timeList + " : " + activityList);
    			System.exit(0);
    		}
    		
    		int val = Integer.parseInt(list[0]);
    		
    		Time.incrementTime(l, val);
    		timeList.add(l);
    		activityList.add(list[1]);
    		
    	}
       
    }
    
}
