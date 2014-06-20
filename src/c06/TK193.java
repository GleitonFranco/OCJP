package c06;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class TK193 {

	public static void main(String[] args) {
		Date d = new Date(0);
		String ds = "December 15, 2004";
		// insert code here
		DateFormat df = DateFormat.getDateInstance();
		try {
		d = df.parse(ds);
		}
		catch(ParseException e) {
		System.out.println("Unable to parse " + ds);
		}
		// insert code here too
		d.setTime( (1000 * 60 * 60 * 24) + d.getTime());
		System.out.println(d);
	}

}
//What creates the appropriate DateFormat object and adds a day to the Date object?