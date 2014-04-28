package c06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d*");//args[0]);
		Matcher m = p.matcher("ab34ef");//args[1]);
		boolean b = false;
		while(b = m.find()) {
			System.out.print(m.start() + m.group());
		}
		
		System.out.println("\n");
		String s = "-";
		Integer x = 343;
		long L343 = 343L;
		if(x.equals(L343)) s += ".e1 ";
		if(x.equals(343)) s += ".e2 ";
		Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));
		if(s1 == 7)
		s += "=s ";
		if(s1 < new Integer(7+1)) s += "fly ";
		System.out.println(s);
		
	}
}
