
public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Name: ");
		String name=ConsoleInput.getString();
		
		System.out.println("Enter Age: ");
		int age=ConsoleInput.getInt();
		
		System.out.println("Enter Phone: ");
		String phone=ConsoleInput.getString();
		
		System.out.println("Enter Address: ");
		String address=ConsoleInput.getString();
		
		System.out.println("Enter Salary: ");
		int salary=ConsoleInput.getInt();
		
		System.out.println("Enter Joining Year: ");
		int year=ConsoleInput.getInt();
		
		System.out.println("Enter Joining Fess: ");
		int fees=ConsoleInput.getInt();
		
		System.out.println("Active ? : ");
		boolean active=ConsoleInput.getBoolean();
		
		
		
		
	PrimeMember m= new PrimeMember(name, age, phone, address,salary, year,fees,active);
         
	m.display();
	m.printSalary();	
	}
	
	

}
