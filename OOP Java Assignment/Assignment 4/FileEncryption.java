import java.io.*;
import java.util.Scanner;

public class FileEncryption {
	
	static final int KEY = 5;
	
	// Encryption method
	public static void encryptFile(String inputFile, String outputFile) {
		
		try {
			
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile);
			
			int data;
			
			while((data = fis.read()) != -1) {
				fos.write(data ^ KEY);
			}
			
			fis.close();
			fos.close();
			
			System.out.println("File is Encrypted successfully.");
			System.out.println("Encrypted file is " + outputFile);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	
	// Decryption method
	public static void decryptFile(String inputFile, String outputFile) {
		
		try {
			
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile);
			
			int data;
			
			while((data = fis.read()) != -1) {
				fos.write(data ^ KEY);
			}
			
			System.out.println("File is Decrypted successfully.");
			System.out.println("Decrypted file is " + outputFile);
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("===== File Encryption Menu =====");
			System.out.println("1. Encrypt file");
			System.out.println("2. Decrypt file");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter the original text file name: ");
				String inputFile = sc.nextLine();
				
				System.out.println("Enter the encrypted file name: ");
				String encryptedFile = sc.nextLine();
				
				encryptFile(inputFile, encryptedFile);
				break;
				
			case 2: 
				System.out.println("Enter the encrypted file name: ");
				String encryptInput = sc.nextLine();
				
				System.out.println("Enter the decrypted file name: ");
				String decryptedFile = sc.nextLine();
				
				encryptFile(encryptInput, decryptedFile);
				break;
				
			case 3: 
				System.out.println("Program Exited");
				sc.close();
				return;
				
			default:
				System.out.println("Invalid choice!");
				
			}
			
		}

	}

}
