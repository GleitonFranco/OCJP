package c06;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		Date d1 = new Date(1000000000000L); // a trillion!
		System.out.println("1st date " + d1.toString());
		d1.setTime(d1.getTime() + 3600000); // 3600000 millis / hour
		System.out.println("new time " + d1.toString());


		Calendar c = Calendar.getInstance();
		c.setTime(d1);		// #1
		if(Calendar.SUNDAY == c.getFirstDayOfWeek())		// #2
			System.out.println("Sunday is the first day of the week");
		System.out.println("trillionth milli day of week is "+ c.get(Calendar.DAY_OF_WEEK));// #3
		c.add(Calendar.MONTH, 1);		// #4
		Date d2 = c.getTime();		// #5
		System.out.println("new date +1m: " + d2.toString() );
		
		c.add(Calendar.HOUR, -4);		// subtract 4 hours from c's value
		c.add(Calendar.YEAR, 2);		// add 2 years to c's value
		c.add(Calendar.DAY_OF_WEEK, -2); // subtract two days from c's value
		
		c.roll(Calendar.MONTH, 9);		// roll deve avancar 9meses sem mudar o ano
		Date d4 = c.getTime();
		System.out.println("new date " + d4.toString() );
		
		System.out.println("\nFORMATS:");
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		for(DateFormat df : dfa)
			System.out.println(df.format(d1));
		
		String s = dfa[2].format(d1);
		try {
			Date d5 = dfa[2].parse(s);
			System.out.println("parsed = " + d5.toString());
		} catch (ParseException e) { e.printStackTrace(); }
		
		System.out.println("\nLOCALE DATES:");
		Locale locIT = new Locale("it", "IT");
		Locale locPT = new Locale("pt");
		Locale locBR = new Locale("pt", "BR");
		Locale locIN = new Locale("hi", "IN");
		Locale locJA = new Locale("ja");
		DateFormat dfUS = DateFormat.getInstance();
		System.out.println("US: " + dfUS.format(d2));
		DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("US full: " + dfUSfull.format(d2));
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Italy: " + dfIT.format(d2));
		DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
		System.out.println("Portugal: " + dfPT.format(d2));
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
		System.out.println("Brasil: " + dfBR.format(d2));
		DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
		System.out.println("India: " + dfIN.format(d2));
		DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
		System.out.println("Japan: " + dfJA.format(d2));
		System.out.println("def: " + locBR.getDisplayCountry());
		System.out.println("loc: " + locBR.getDisplayCountry(locBR));
		System.out.println("def: " + locBR.getDisplayLanguage());
		System.out.println("loc BR: " + locBR.getDisplayLanguage(locBR));
		System.out.println("loc IT: " + locBR.getDisplayLanguage(locIT));
		
		
	}

}
