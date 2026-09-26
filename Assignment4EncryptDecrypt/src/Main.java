import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
public class Main {

	public static void main(String[] args) {
		
		int choice=0;
		boolean flag=false;
		
		System.out.println("Enter File Path");		
		String path=ConsoleInput.getString();
		System.out.println(path);
		File directory= new File(path);
		
		do {	
			System.out.println("Enter Your Choice");
			System.out.println("1.Encryption");
			System.out.println("2.Decryption");
			System.out.println("3.Exit");	
		    choice=ConsoleInput.getInt();		
		    
		    
		switch(choice) {
		case 1: 
			if(flag==false) {
			    Encrypt.Encrypt(directory);
			    System.out.println("File Encrypted");
			    System.out.println("**************************");
			    flag=true;
			}
			else {
				System.out.println("File Already Encrypted");
			    System.out.println("**************************");
			}
			
			break;
		
		case 2:
			if(flag==true) {
				Decrypt.Decrypt(directory);
				flag=false;
			    System.out.println("File Decrypted");
			    System.out.println("**************************");
			}
			else {
				System.out.println("File Already Decrypted");
			    System.out.println("**************************");
			}
			
			break;
			default: break;
		
		   }		
		}while(choice!=3);

	}

}
