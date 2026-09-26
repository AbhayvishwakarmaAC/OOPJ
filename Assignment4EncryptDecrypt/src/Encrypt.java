import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Encrypt {
	
	public static void Encrypt(File directory) {
		
//      FileInputStream readData;   // reading
//		FileOutputStream writeData;  //writing
//		writeData=null;
//		readData=null;
		
		try (FileInputStream readData=new FileInputStream(directory)
				){
			
//			byte Encryption[]= new byte[(int)directory.length()];
			
			byte[] Encryption = readData.readAllBytes();
			
//			readData.read(Encryption);
			
			for(int tmp=0; tmp<(int)directory.length(); tmp++) {
			    Encryption[tmp]=(byte)(Encryption[tmp]+8);
			    
//			    for(byte tmp1:Encryption) {
//			    	tmp1=(byte)(tmp+8);
//			    }
			    
			try( FileOutputStream writeData=new FileOutputStream(directory)){ 
		    writeData.write(Encryption);
		}

//			System.out.println(new String(Encryption));

	}
		} catch(IOException e) {
			System.out.println("Bhago Encryption me Pehla Exception aaya");
		}
		catch(Exception e) {
				System.out.println("Bhago Encryption Dusra Null Exception aaya");
			}
		
		}
		
		
}
	
