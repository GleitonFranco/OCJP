package c06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {

	public static void main(String[] args) {
		char[] in = new char[50];
		// to store input
		int size = 0;
		try {
			File file = new File(		// just an object (nao criou um arquivo fisico no disco; criaria se metodo .createNewFile())
					"fileWrite2.txt");
			FileWriter fw =
					new FileWriter(file); // create an actual file in disk & a FileWriter obj
			fw.write("howdy\nfolks\n");
			// write characters to the file
			fw.flush();
			// flush before closing
			fw.close();
			// close file when done

			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.println(size + " caracteres");
			for(char c : in)
				System.out.print(c);
			fr.close();
			
			File dhome = new File("/home/gleiton/");
			File f4 = new File(dhome,"testfile.txt");
			f4.createNewFile();
			System.out.print(dhome.isDirectory());
			
			
			
		} catch(IOException e) { }
	}

}
