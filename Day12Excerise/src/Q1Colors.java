import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Q1Colors {

	public static void main(String[] args) {
     
		ArrayList<String> colors= new ArrayList<>();

		colors.add("Pink");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Green");
		
//		Collections.sort(colors);   // Q7
//		
//		Iterator<String> itrColor= colors.iterator();
//		while(itrColor.hasNext()) 
//			System.out.println(itrColor.next());

		
		ArrayList<String> colorsCopy= new ArrayList<>();
		
		colorsCopy.addAll(colors);  // Q8
		
//		Collections.shuffle(colorsCopy);   //Q9 TO shuffle 
		
		Collections.reverse(colorsCopy);  // Q10 to reverse
		
		
		Iterator<String> itrColorCopy= colorsCopy.iterator();
		while(itrColorCopy.hasNext()) 
			System.out.println(itrColorCopy.next());

	}

}
