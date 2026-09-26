import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String args[]) {

		String name;
		String address;
		int age;
		char gender;
		float basicSalary;
		float HRA;
		float overTime;
		float commission;

		int choice;

		ArrayList<Employee> employee = new ArrayList<>();

		do {
			System.out.println("Choose A Option");
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Sort");
			System.out.println("5.Save");
			System.out.println("6.Load");
			System.out.println("7.Exit");
			choice = ConsoleInput.getInt();
			switch (choice) {

			case 1:
					while (choice != 4) {
						System.out.println("1. Manager");
						System.out.println("2. Engineer");
						System.out.println("3. Sales Person");
						System.out.println("4. Exit");
						choice = ConsoleInput.getInt();
						if (choice == 4)
							break;
						System.out.println("Enter the Name:");
						name = ConsoleInput.getString();
						System.out.println("Enter the Address:");
						address = ConsoleInput.getString();
						System.out.println("Enter the Age:");
						age = ConsoleInput.getInt();
						System.out.println("Enter the Gender:");
						gender = ConsoleInput.getChar();
						System.out.println("Enter the Basic Salary:");
						basicSalary = ConsoleInput.getFloat();
	
						switch (choice) {
	
						case 1:
							System.out.println("Enter the HRA:");
							HRA = ConsoleInput.getFloat();
							employee.add(new Manager(name, address, age, gender, basicSalary, HRA));
							break;
						case 2:
							System.out.println("Enter the Over-Time:");
							overTime = ConsoleInput.getFloat();
							employee.add(new Engineer(name, address, age, gender, basicSalary, overTime));
							break;
	
						case 3:
							System.out.println("Enter the Comission");
							commission = ConsoleInput.getFloat();
							employee.add(new SalesPerson(name, address, age, gender, basicSalary, commission));
							break;
	
						default:
							break;
						}
					}
					break;
			case 2:
					while (choice != 5) {
						System.out.println("1.Display All Employee");
						System.out.println("2.Display Manager");
						System.out.println("3.Display Engineer");
						System.out.println("4.Display Sales Person");
						System.out.println("5.Exit");
						choice = ConsoleInput.getInt();
	
						switch (choice) {
						case 1:
							Iterator<Employee> iterator = employee.iterator();
							while (iterator.hasNext()) {
								Employee objEmployee = iterator.next();
								System.out.println(objEmployee);
								System.out.println("*******************************");
							}
							break;
						case 2:
							Iterator<Employee> iteratManager = employee.iterator();
							while (iteratManager.hasNext()) {
								Employee objEmployee = iteratManager.next();
								if (objEmployee instanceof Manager) {
									System.out.println(objEmployee);
									System.out.println("*******************************");
								}
							}
	
							break;
						case 3:
							Iterator<Employee> iterateEngg = employee.iterator();
							while (iterateEngg.hasNext()) {
								Employee objEmployee = iterateEngg.next();
								if (objEmployee instanceof Engineer) {
									System.out.println(objEmployee);
									System.out.println("*******************************");
								}
							}
							break;
					case 4:
						Iterator<Employee> iterateSales = employee.iterator();
						while (iterateSales.hasNext()) {
							Employee objEmployee = iterateSales.next();
							if (objEmployee instanceof SalesPerson) {
								System.out.println(objEmployee);
								System.out.println("*******************************");
							}
						}
						break;
					default:break;						
					}
				}
				break;

			case 3:
					System.out.println("Enter the Employee Id");
					int idtoDelete=ConsoleInput.getInt();
					System.out.println("Enter the Employee Name");
					String nametoDelete=ConsoleInput.getString();				
					Iterator<Employee> iteratToDelete= employee.iterator();
					
					while(iteratToDelete.hasNext()) {
						Employee emp = iteratToDelete.next();
						if(emp.getID()==idtoDelete&&emp.getName().equalsIgnoreCase(nametoDelete)){
							iteratToDelete.remove();
							System.out.println("Employee Deleted Successfully");
						}
					}
					break;
				 
			case 4: while(choice!=5) {				
					  System.out.println("1.By Name Ascending");
					  System.out.println("2.By Name Descending");
					  System.out.println("3.By Designation(TBD)"); 
					  System.out.println("5.Exit");
				      choice=ConsoleInput.getInt();
				      switch(choice) {
				      case 1: 
				    	  employee.sort((e1,e2)-> e1.getName().compareTo(e2.getName()));
				    	  System.out.println("Sorted in Ascending Order");
				    	  break;
				      case 2: 
				    	  employee.sort((e1,e2)-> e2.getName().compareTo(e1.getName()));  
				    	  System.out.println("Sorted in descending Order");
				    	  break;
				      case 3:break;
				      default:break;
				    	  }
				      }
				
				
			
				
				    break;
			case 5:
					try (FileOutputStream path = new FileOutputStream(
							"D:\\OOPJ\\Codes\\Assignment2Employee\\Data\\Employee.txt");
							ObjectOutputStream empWrite = new ObjectOutputStream(path)) {
						for (Employee emp : employee)
							empWrite.writeObject(emp);  
	
						System.out.println("Data Saved Successfully");
	
					} catch (FileNotFoundException e) {
						System.out.println("File Not found");
					} catch (IOException e1) {
						System.out.println("Can not Write the data");
					}
	
					break;
			case 6:
					try (FileInputStream path = new FileInputStream(
							"D:\\OOPJ\\Codes\\Assignment2Employee\\Data\\Employee.txt");
							ObjectInputStream empRead = new ObjectInputStream(path)) {
						try {
							while (true) {
								Employee emp = (Employee) empRead.readObject();
								employee.add(emp);
							}
						} catch (ClassNotFoundException e) {
							System.out.println("Class Not Found");
						} catch (EOFException e) {
							System.out.println("Data Loaded");
						}
	
					} catch (FileNotFoundException e) {
						System.out.println("File Not found");
					} catch (IOException e1) {
						System.out.println("Can not Write the data");
					}
				    break;
			default:break;				
			}
		} while (choice != 7);

	}

}
