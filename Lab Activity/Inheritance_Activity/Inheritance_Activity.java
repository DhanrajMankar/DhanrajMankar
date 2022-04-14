package LabActivity;

public class Inheritance_Activity {
	public static void main(String[]args) {
		
		Manager m1=new Manager(126534,"Peter","Chennai India",237844,65000);
		m1.calculatesalary(65000);
		m1.calculateTransportAllowance(65000);
		
		Trainee t1=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		t1.calculatesalary(45000);
		t1.calculateTransportAllowance(45000);
		
	}
	
}
