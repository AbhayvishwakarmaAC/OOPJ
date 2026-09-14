
public class Employee {
	String name;
	int YearOfJoining;
	int salary;
	String Address;
	
	Employee(String n, int y, int s, String a){
		name=n;
		YearOfJoining=y;
		salary=s;
		Address=a;
	}
	
	public void display() {
		System.out.println("Name:          "+name);
		System.out.println("YearOfJoining: "+YearOfJoining);
		System.out.println("Salary:        "+salary+"Rs");
		System.out.println("Address:       "+Address);
	}
	
	
	
	public static void main(String[] args) {
		
		Employee E[]= {new Employee("Robert", 1994,50000,"64C-WallsStreat"),
				       new Employee("Sam", 2000,6000,"68D-WallsStreat"),
				       new Employee("John", 1999,7000,"26B-WallsStreat")
		               };
		
		for(int tmp=0; tmp<3; tmp++) {
		      E[tmp].display();
		      System.out.println();
		}
//		
//		Employee E1=new Employee("Robert", 1994,5000,"64C-WallsStreat");
//		Employee E2=new Employee("Robert", 1994,5000,"64C-WallsStreat");
//		Employee E3=new Employee("Robert", 1994,5000,"64C-WallsStreat");
	}

}
