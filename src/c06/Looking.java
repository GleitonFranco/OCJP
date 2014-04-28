package c06;

import java.util.Scanner;

public class Looking {
	public static void main(String[] args) {
		String input = "1 2 a 3 45 6";
		Scanner sc = new Scanner(input);
		int x = 0;
		do {
			x = sc.nextInt();
			System.out.print(x + " ");
		} while (x!=0);
	}
}


//What is the result?
//A. 1 2
//B. 1 2 3 45 6
//C. 1 2 3 4 5 6
//D. 1 2 a 3 45 6
//E. Compilation fails
//F. 1 2 followed by an exception