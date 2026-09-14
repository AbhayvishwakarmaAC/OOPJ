
public class Employees {
	String name;
	int YearOfJoining;
	int salary;
	int workhr;
	String Address;
	
	Employees(String n, int y, String a){
		name=n;
		YearOfJoining=y;
		salary=0;
		Address=a;
	}
	
	public void getinfo(int sal, int whr) {
		salary=sal;
		workhr=whr;	
	}
	
	public void addSalary() {
		if(salary<=500) 
			 salary=salary+10;
		else
			 salary=salary+0;
	}
	
	public void addWork() {
		if(workhr>6) 
			salary=salary+5;
		else
			salary=salary+0;
	}
	
	
	public void display() {
		System.out.println("Name:          "+name);
		System.out.println("YearOfJoining: "+YearOfJoining);
		System.out.println("Salary:        "+salary+"Rs");
		System.out.println("Address:       "+Address);
	}
	
	
	
	public static void main(String[] args) {
		
		Employees E[]= {new Employees("Robert", 1994,"64C-WallsStreat"),
				        new Employees("Sam", 2000,"68D-WallsStreat"),
				        new Employees("John", 1999,"26B-WallsStreat")
		               };

		E[0].getinfo(500,6);
		E[1].getinfo(600,7);
		E[2].getinfo(700,8);
          	
		
		for(int tmp=0; tmp<3; tmp++) {
			  E[tmp].addSalary();
		      E[tmp].addWork();
		      E[tmp].display();
		      System.out.println();
		     
		}
		
		
		
		
		
//		
//		Employee E1=new Employee("Robert", 1994,5000,"64C-WallsStreat");
//		Employee E2=new Employee("Robert", 1994,5000,"64C-WallsStreat");
//		Employee E3=new Employee("Robert", 1994,5000,"64C-WallsStreat");
	}

}
