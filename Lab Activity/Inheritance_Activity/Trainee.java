package LabActivity;

public class Trainee extends Employee {
	

	double BasicSalary;
    
	public Trainee(long employeeId, String employeeName, String employeeAdress, long empolyeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAdress, empolyeePhone);
		BasicSalary = basicSalary;
	}

	public void calculatesalary(double BasicSalary){
		   
		   double Salary;
		   Salary=BasicSalary+(( BasicSalary * SpecialAllowance/100)+(BasicSalary*Hra/100));
		   System.out.println("The total Salary is : "+Salary);
	    	
	    }
	

	

}
