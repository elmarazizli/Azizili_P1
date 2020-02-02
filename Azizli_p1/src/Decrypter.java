import java.util.Scanner;

public class Decrypter {
	
	static int Number;
	static int Number1;
	static int Number2;     
	static int Number3;
	static int Number4;

	public static void Decrypt() {
		
		Scanner Digits = new Scanner(System.in);

		System.out.println("Enter number to Decrypt: ");

		// Input from the User
		Number = Digits.nextInt();
		
					
		//Separation of integers 
		Number3 = Number / 1000;
        Number4 = (Number % 1000) /100;
        Number1 = (Number % 100) /10;
        Number2 = Number % 10;
        
        Number1 = (Number1 +3) % 10;
        Number2 = (Number2 +3) % 10;
        Number3 = (Number3 +3) % 10;
        Number4 = (Number4 +3) % 10;

		 
	
	}
}
