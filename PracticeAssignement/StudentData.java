
public class StudentData {
	
	public static class Student{  // if Non Static see then we have to create
		                          // StudentData outer=new StudentData();
		                          // Sand then Student s1= outer.new Student();
	private String name;
	private int rollNo;
	private String phoneNo;
	private String address;
	
	Student(String sname, int srollNo, String sphoneNo,
			String saddress){
		name=sname;
		rollNo=srollNo;
		phoneNo=sphoneNo;
		address=saddress;
	}
	
	public void display() {
		System.out.println("Name: "+name+"\nRoll No: "+rollNo+"\nPhone No: "+phoneNo+"\nAddress: "+address);		
	}
	
	}
	
	public static void main(String[] args) {
				
		Student objStudent1= new Student("john", 2,"9999999","China");
		Student objStudent2= new Student("Sam", 3,"7777777","Bihar");
		System.out.println("Student Date is");
		objStudent1.display();
		objStudent2.display();
		
	}

}
