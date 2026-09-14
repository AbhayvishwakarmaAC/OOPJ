public class Third {

	public static void main(String[] args) {
		
		System.out.println("Enter the Fisrt Number");
		int num1=getInt();
		System.out.println("Enter Second Number");
		int num2=getInt();
		
		System.out.println("The Sum is"+(num1+num2));
		
	}
	
	
	public static int getInt() {
		 try {
				byte arr[]= new byte [100];         // Created Arry of 100 byte
				System.out.println("Enter value");
				int length= System.in.read(arr);      // Read arr from keyboard 
				System.out.println(new String(arr));          // printed arr.. Why we took new String arr?
				byte []arrfinal=new byte[length-2];           // create array of size length- 2 to remove \n\r
				System.arraycopy(arr, 0, arrfinal, 0, length-2); //copy the content till length-2
	            String objString=new String(arrfinal);           // object of string and passed argument arr and copy into objString;
	            System.out.println("Data entered is "+ objString);  // Print objString
	            int num1=Integer.parseInt(objString); // Convert String to Number
			      return num1;
		       }catch(Exception e) {
//				 System.out.println("Exception is  "+e);
				 e.printStackTrace();
				 return -1;
			 }
	}
}






//public static void main(String[] args) {
//	 try {
//		byte arr[]= new byte [100];         // Created Arry of 100 byte
//		System.out.println("Enter value");
//		int length= System.in.read(arr);      // Read arr from keyboard 
//		System.out.println(new String(arr));          // printed arr.. Why we took new String arr?
//		byte []arrfinal=new byte[length-2];           // create array of size length- 2 to remove \n\r
//		System.arraycopy(arr, 0, arrfinal, 0, length-2); //copy the content till length-2
//       String objString=new String(arrfinal);           // object of string and passed argument arr and copy into objString;
//       System.out.println("Data entered is "+ objString);  // Print objString
////       int num1=Integer.parseInt(objString); // Convert String to Number
//       float num2=Float.parseFloat(objString);
//	 }catch(Exception e) {
////		 System.out.println("Exception is  "+e);
//		 e.printStackTrace();
//	 }
//}
//}