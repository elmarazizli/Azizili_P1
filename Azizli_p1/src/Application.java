import java.util.Scanner;

public class Application {
	
	static Scanner in = new Scanner(System.in);
	public static int Option = 0;
	

	public static void main(String[] args) {

		
		Encrypter Encrypt = new Encrypter();
		Decrypter Decrypt = new Decrypter();

		System.out.println("Encrypt put 1");
		System.out.println("Decrypt put 2");
		System.out.print("Option: ");
		Option = in.nextInt();

		if(Option == 1){
				Encrypter.Encrypt(); 
				System.out.print("Your Encrypted code is: " + Encrypt.Number1 + " ");
				System.out.print(Encrypt.Number2 + " ");
				System.out.print(Encrypt.Number3 + " ");
				System.out.println(Encrypt.Number4);
		}else if(Option == 2) {
				Decrypter.Decrypt();
				System.out.print("Your Encrypted code is: " + Decrypt.Number1 + " ");
				System.out.print(Decrypt.Number2 + " ");
				System.out.print(Decrypt.Number3 + " ");
				System.out.println(Decrypt.Number4);
		}else {
				System.out.print("bye");
		}

	}

}
