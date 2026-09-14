
public class ReverseArray {
	
	public static void main(String[] args) {
		int numOfArray=0;
		System.out.println("Enter the Number of Array");
		numOfArray=ConsoleInput.getInt();
		
		int array[]=new int[numOfArray];
		System.out.println("Enter the Number:");
      for(int tmp=0; tmp<numOfArray; tmp++) {
         array[tmp]=ConsoleInput.getInt();
      }
      System.out.println("Original Array: ");
      for(int tmp=0; tmp<numOfArray; tmp++) {
    	  System.out.print(array[tmp]+" ");
          array[tmp]=array[numOfArray-tmp-1];
       }
      System.out.println();
      System.out.println("Revesed Array: ");
      for(int tmp=0; tmp<numOfArray; tmp++) {
    	  
    	  System.out.print(array[tmp]+" ");
    	  
      }
  	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    // Long Solution with Copy Arrays in Reverse 
//	public static void main(String[] args) {
//		int numOfArray=0;
//		System.out.println("Enter the Number of Array");
//		numOfArray=ConsoleInput.getInt();
//		
//		int array[]=new int[numOfArray];
//		int arrayCopy[]=new int[numOfArray];
//		System.out.println("Enter the Number:");
//        for(int tmp=0; tmp<numOfArray; tmp++) {
//           array[tmp]=ConsoleInput.getInt();
//        }
//    	System.out.println("The Original Array ");
//        for(int tmp=0; tmp<numOfArray; tmp++) {
//        	arrayCopy[tmp]=array[numOfArray-tmp-1];
//        	System.out.println(array[tmp]+" ");
//          }
//        
//         System.out.println("The Revesed Array ");
//         
//         for(int tmp=0; tmp<numOfArray; tmp++) {
//         	System.out.println(arrayCopy[tmp]+" ");
//          }
//	}


}
