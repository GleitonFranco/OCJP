package c10develop;

import java.util.Properties;

public class TestProps {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.setProperty("myProp", "myValue");
		p.list(System.out);
	}

}


// java -DcmdProp=cmdVal TestProps