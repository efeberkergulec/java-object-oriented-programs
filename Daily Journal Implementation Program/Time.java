public class Time {

	public String name; // 6:17

	/**
	 * s is a time in the 24-hour-string format Return the same time in
	 * 24-hour-verbose format
	 */

	public Time(String s) {
		if(s.contains("AM") || s.contains("PM")) {
			s = this.eliminateAMPM(s);
		} else if(s.length() > 10) {
			s = this.eliminateVerbose(s);
		} else {
			s = this.name;
		}
		
	}

	public static String toVerbose(String s) {
		String[] arr = s.split(":");
		String verb = arr[0] + " hours and " + arr[1] + " minutes";
		return verb;
	}

	/**
	 * s is a time in the 24-hour-verbose format Return the same time in
	 * 24-hour-string format
	 */
	public static String eliminateVerbose(String s) {
		String[] arr = s.split(" ");
		String elm = arr[0] + ":" + arr[3];
		return elm;
	}

	/**
	 * s is a time in the 24-hour-string format Return the same time in AM-PM
	 * format
	 */
	public static String toAMPM(String s) {
		String[] arr = s.split(":");
		String d;
		int hour = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[1]);
		if (hour >= 12){
			d = ((hour - 12) + ":" + min + "PM");
		}	
		else{
			d = ((hour) + ":" + min + "AM");
		}	
		System.out.println(d);
		return d;
	}

	/**
	 * s is a time in AM-PM-string format; Return the same time in
	 * 24-hour-string format.
	 */
	public static String eliminateAMPM(String s) 
	{
		System.out.println(s);
		String[] arr = s.split(":");
		int hour = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[1].substring(0, 2));
		if (arr[1].length() > 2 && arr[1].substring(2, 4).equals("PM"))
			return (hour + 12) + ":" + min;
		else if(arr[1].length() > 2 && arr[1].substring(2, 4).equals("AM"))
			return hour + ":" + min;
		return "";
	}

	/**
	 * s is a time in EITHER the 24-hour-string format OR the AM-PM-string
	 * format; Return the same time in the 24-hour-string format
	 */
	public static String removeAMPM(String s) {
		String[] arr = s.split(":");
		return arr[0] + ":" + arr[1].substring(0, 2);
	}

	/**
	 * s is a time in the 24-hour-string format; Return the time as the number
	 * of minutes. E.g. "14:35" is 14*60 + 35.
	 */
	public static int timeInMinutes(String s) {
		String[] arr = s.split(":");
		int hour = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[1]);
		return (hour * 60) + min;
	}

	/**
	 * minutes is a time in total number of minutes; Return the time in the
	 * 24-hour-string format
	 */
	public static String minutesToTime(int minutes) {
		return (minutes / 60) + ":" + (minutes % 60);
	}

	/**
	 * s is a time in the AM-PM-string format; Return the time as the number of
	 * minutes. E.g. "14:35" is 14*60 + 35. See if you can write the body as a
	 * single return statement.
	 */
	public static int AMPMTimeInMinutes(String s) {
		String[] arr = s.split(":");
		int hour = Integer.parseInt(arr[0]);
		String st = arr[1].substring(0, 2);
		int min = Integer.parseInt(st);
		if (arr[1].substring(2, 4).equals("PM"))
			return (hour * 60) + (12 * 60) + min;
		else
			return (hour * 60) + min;
	}

	/**
	 * increments the argument time for x minutes
	 */
	public static String incrementTime(Time time, int x) {
		String t = time.toString();
		String[] arr = t.split(":");
		int hour = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[1].substring(0, 2));

		if (min >= 60) {
			min %= 60;
			hour++;
		}
		if (arr[1].length() > 2 && arr[1].substring(2, 4).equals("AM")) {
			hour %= 12;
			arr[1].replaceAll("AM", "PM");
		} 
		else if (arr[1].length() > 2 && arr[1].substring(2, 4).equals("PM")) {
			hour %= 12;
			arr[1].replaceAll("PM", "AM");
		}
		String str = arr[0] + ":" + arr[1];
		return str;
	}

	public String toString() 
	{
		return eliminateAMPM(this.name);
	}

}