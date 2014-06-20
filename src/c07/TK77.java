package c07;

import java.util.Arrays;

public class TK77 {

	public static void main(String[] args) {
		String[] colors = {"blue", "red", "green", "yellow", "orange"};
		for (String c : colors)	System.out.print(c+" ");
		Arrays.sort(colors);
		System.out.println();
		for (String c : colors)	System.out.print(c+" ");
		System.out.println();
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "violet");
		System.out.println(s2 + " " + s3);
	}

}
