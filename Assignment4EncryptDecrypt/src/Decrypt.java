import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Decrypt {

	public static void Decrypt(File Dirctory) {
//		FileInputStream readEncryptData;
//		FileOutputStream writeEncryption;
//		writeEncryption = null;
//		readEncryptData = null;
		try (FileInputStream readEncryptData = new FileInputStream(Dirctory))
		{
			
			byte[] decyptionData = new byte[(int) Dirctory.length()];
			readEncryptData.read(decyptionData);
			for (int tmp = 0; tmp < (int) Dirctory.length(); tmp++) {
				decyptionData[tmp] = (byte) (decyptionData[tmp] - 8);
			}
			System.out.println(new String(decyptionData));

			try(FileOutputStream writeEncryption = new FileOutputStream(Dirctory)){
			writeEncryption.write(decyptionData);

		} 
		}catch (IOException e) {
			System.out.println("Bhago Encryption me Pehla Exception aaya");
		} catch (Exception e) {
				System.out.println("Bhago Encryption Dusra Null Exception aaya");
			}
		}


}
