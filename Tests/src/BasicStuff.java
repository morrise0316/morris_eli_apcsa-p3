import java.util.Scanner;

public class BasicStuff {

	public BasicStuff() {
		
	}

	public static void main(String[] args) {
		String str = "notString";
		if (str.length() >= 3 && str.substring(0, 3) == ("not")) {
		   System.out.println(str);
		  }
		else
		  System.out.println("not" + str);
		}

}
