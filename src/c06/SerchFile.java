package c06;

import java.io.File;

public class SerchFile {

	public static void main(String[] args) {
		int x=0;
		String[] files;// = new String[10];
		File search = new File("/home/gleiton/");
		files = search.list();
		for(String fn : search.list())
			System.out.println(x+++" - " + fn);
			
	}

}
