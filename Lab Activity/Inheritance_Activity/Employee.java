package LabActivity;

public class Employee {

	long employeeId;
	String employeeName;
	String employeeAdress;
	long empolyeePhone;
	static double SpecialAllowance=250.80;
   static  double Hra=1000.50;
	




public Employee(long employeeId, String employeeName, String employeeAdress, long empolyeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAdress = employeeAdress;
		this.empolyeePhone = empolyeePhone;
	}


public void calculateTransportAllowance (double basicSalary) {
	double transportAllowance = basicSalary*0.10;
	 System.out.println("The Transport Allowance is : "+transportAllowance);
}
  
    
}
