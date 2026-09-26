import java.util.TreeSet;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Set;
public class Q11Tree {

	public static void main(String[] args) {
		
		Set<String> colors= new TreeSet<>();
		
		colors.add("Green");
		colors.add("Pink");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("Orange");
		colors.add("White");
		
		System.out.println(colors);
		
		Set<String> colors2= new TreeSet<>();
		
		colors2.addAll(colors);      // Q2..
		
		
		System.out.println(colors2);
		
		TreeSet<String> colors3= new TreeSet<>(Collections.reverseOrder());

		colors3.addAll(colors);
		System.out.println(colors3);
//		Q14.
		System.out.println("fisrt: "+ colors3.first());   
		System.out.println("fisrt: "+ colors3.last());
		
//		Q15.
		System.out.println("Ceiling: "+ colors3.ceiling("blue"));   
		System.out.println("Ceiling: "+ colors3.ceiling("Red"));
		
	}

}
