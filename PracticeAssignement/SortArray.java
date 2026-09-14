
public class SortArray {

	public static void main(String[] args) {
		int numOfArray=0;
		System.out.println("Enter the Number of Array");
		numOfArray=ConsoleInput.getInt();
		
		int array[]=new int[numOfArray];
		System.out.println("Enter the Number:");
        for(int tmp=0; tmp<numOfArray; tmp++) {
           array[tmp]=ConsoleInput.getInt();
        }
		
		// 5 6 3 10 
        int tempValue=0;
        for(int tmp=0; tmp<numOfArray; tmp++){
        	for(int tmp1=tmp; tmp1<numOfArray; tmp1++) {
        	if(array[tmp]>array[tmp1]){ 
        		tempValue=array[tmp];
        		array[tmp]=array[tmp1];
        		array[tmp1]=tempValue;
        	 }
	       }
        }
        for(int tmp=0; tmp<numOfArray; tmp++) {
        System.out.println(array[tmp]);
        }
	}
}
