
public class CommonBetween2Array {
	
		public static void main(String[] args) {
			int numOfArray=5;
			System.out.println("Enter the Number of Array");
//			numOfArray=ConsoleInput.getInt();
			
			int array[]=new int[numOfArray];
			System.out.println("Enter 1st Arrays Number:");
	      for(int tmp=0; tmp<numOfArray; tmp++) {
	         array[tmp]=ConsoleInput.getInt();
	      }
	      
			int array2[]=new int[numOfArray];
			System.out.println("Enter 2nd Arrays Number:");
	      for(int tmp=0; tmp<numOfArray; tmp++) {
	         array2[tmp]=ConsoleInput.getInt();
	      }
	      int common=0;
	      for(int tmp=0; tmp<numOfArray; tmp++) {
	    	  
	    	  boolean alredaypresen=false;
	    	  
		      for(int tmp1=0; tmp1<tmp; tmp1++) { 
		    	 if(array[tmp]==array[tmp1]) {
		    		 alredaypresen=true;
		    	     break;
		    	 }
	    	  
		      }
	    	  
		      if(alredaypresen) 
	                continue;
	            
		      
		      for(int tmp1=0; tmp1<numOfArray; tmp1++) {
		    	 if(array[tmp]==array2[tmp1])
		    		 common=array[tmp];

		      }	
		      
		      if(common!=0)
		      System.out.println(common);
		      common=0;
	      }
	      
	      
		}	
}
		
