import java.util.ArrayList;
import java.util.Iterator;
public class Q1Colors {

	public static void main(String[] args) {
     
		ArrayList<String> colors= new ArrayList<>();
		
		colors.add("Pink");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Green");
		
		colors.add(0, "Purple"); // Q2.. Inserted New Color
		
		colors.set(2, "Abhay is New Color"); // Q4..Modified Yellow
		
		colors.remove(3);  // Q5 Removed 3rd Element  Red Removed
		//or
		colors.remove("Pink");
		
		
		if(colors.contains("Pink")) {              //Q6 Search Specific Element
			System.out.println("Pink is Present");
		}else
			System.out.println("Pink Nahi hai");
		
		
		Iterator<String> itrColor= colors.iterator();
		while(itrColor.hasNext()) 
			System.out.println(itrColor.next());
		
       System.out.println("Element at Index 2: "+colors.get(2));    //Q3...Element at Index
	}

}
