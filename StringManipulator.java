import java.util.*;

class StringManipulator{

	private static String ps = "111";

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String attempt = "";

		while(true){

			System.out.print("What is your password? ");
			attempt = sc.nextLine();

			if(attempt.equals(ps)){
			System.out.println("Welcome, user.");
			System.exit(0);
			}

			else if(attempt.equals("exit")){
			System.exit(0);
			}

			else{
			System.out.println("Wrong password.");
			}

		}


		

	}



}