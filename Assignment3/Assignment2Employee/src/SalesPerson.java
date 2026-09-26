
public class SalesPerson extends Employee{
	private static int ID=1000;
	private double commission;
	
	SalesPerson(String name, String address, int age, char gender, float basicSalary,float commission){
	  	  
	  	  super(name, address, age, gender, ValidateSalary(basicSalary));
	  	  if(commission<0||commission>2000)
	  		  this.commission=0;
	  	  else
	  	      this.commission=commission;
	  	  this.Id=++ID;
	  	  
	    }
	
	public static float ValidateSalary(float basicSalary) {
		if(basicSalary<5000||basicSalary>100000)
			return 5000;
		else
			return basicSalary;
	}

	public double getCommission() {
		return commission;
	}

	@Override
	public String toString() {
		
		return "SalesPerson: "+super.toString()+" commission=" + commission + "]";
	}
	
	
	

}
