
public class PrimeMember extends Member{
	
	private int joiningYear;
	private int joiningFees;
	private boolean isActive;
	
	
	PrimeMember(String name, int age, String phone, String address, int salary,int joiningYear, int joiningFees, boolean isActive){
		super(name,age,phone,address,salary );
		this.joiningYear=joiningYear;
		this.joiningFees=joiningFees;
		this.isActive=isActive;
	}
	
	public void display(){		
		System.out.println("Name:         "+getName());
		System.out.println("age:          "+getAge());
		System.out.println("Phone:        "+getPhone());
		System.out.println("Address:      "+getAddress());
		System.out.println("Salary:       "+getSalary());
		System.out.println("Joining Year: "+joiningYear);
		System.out.println("Joining Fees: "+joiningFees);
		System.out.println("Active ?:     "+isActive);		
	}
	

}
