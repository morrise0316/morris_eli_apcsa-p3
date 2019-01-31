import java.util.Scanner;
public class AgeDetermine {
	
	private void Ager(int x) {
		if(x<16) {
			System.out.println("LOL. You can't do anything");
		}
		if(x>= 16) {
			System.out.print("You can drive");
			if(x >= 18) {
				System.out.print(", vote");
				if( x >= 21) {
					System.out.println(", and drink");
				}
			}
		}
	}


	public static void main(String[] args) {
		
		System.out.println("What is your name?");
		
		Scanner name = new Scanner(System.in);
		
		String n = name.next();
		
		name.close();
		
		System.out.println("Hello " + n + "\n" + "How old are you?");
		
		Scanner age = new Scanner(System.in);
		
		age.close();
		
		int i = age.nextInt();
		
		
		
		AgeDetermine Mike = new AgeDetermine();
		Mike.Ager(i);

	}

}
