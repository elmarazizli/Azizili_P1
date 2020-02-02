import java.util.Scanner;

public class Encrypter {
	
    static int Number;
	static int Number1;
	static int Number2;    
	static int Number3;
	static int Number4;
	static int S;
	
	public static void Encrypt() {

		Scanner Digits = new Scanner(System.in);

		System.out.println("Enter number to Encrypt: ");
		
		Number = Digits.nextInt(); 
			
			
		Number3 = ((Number + 7) % 10);
		Number4 = ((Number % 1000) / 10);
		Number1 = ((Number % 100) / 10);
		Number3 = (Number % 10);
		
		Number1 = (Number1 + 7) % 10;
		Number2 = (Number2 + 7) % 10;
		Number3 = (Number3 + 7) % 10;
		Number4 = (Number4 + 7) % 10;
			
		}

		

	}

