package c06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSmall {

	public static void main(String[] args) {
		String source = "yyxxxyxx";
		Pattern p = Pattern.compile(".*?xx");		// the expression
		Matcher m = p.matcher(source);		// the source
		System.out.println("0123456789");
		System.out.println(source);
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
	}

}
