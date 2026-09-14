
public class Member {
	private String name;
	private int age;
	private String phone;
	private String address;
	private int salary;
	
	Member(String name, int age, String phone, String address, int salary){
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
		
	}	
	
	
	public String getName() {
		return name;
	}






	public int getAge() {
		return age;
	}






	public String getPhone() {
		return phone;
	}






	public String getAddress() {
		return address;
	}






	public int getSalary() {
		return salary;
	}






	public void printSalary() {
		System.out.println("Salary is :  "+salary);
	}	

}
