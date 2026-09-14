
public class StringSort {

	    public static void main(String[] args) {
	        String s1 = "apple";
	        String s2 = "banana";
	        String s3 = "apple";
	        String s4 = "Apple"; // Uppercase 'A'

	        System.out.println(s1.compareTo(s2)); // Output: -1  (s1 comes before s2)
	        System.out.println(s2.compareTo(s1)); // Output: 1   (s2 comes after s1)
	        System.out.println(s1.compareTo(s3)); // Output: 0   (They are identical)
	        
	        // Case-sensitivity breakdown
	        System.out.println(s1.compareTo(s4)); // Output: 32  ('a' is 97, 'A' is 65 in Unicode -> 97 - 65 = 32)
	    }
	}


