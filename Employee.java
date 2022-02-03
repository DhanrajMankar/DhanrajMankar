package Dhanarjanudip01;
class Employee
{
float salary=20000;
}
class Developer extends Employee{
int bonus=5000;
public static void main(String args[]){
Developer d=new Developer();
System.out.println("Salary of developer is:"+d.salary);
System.out.println("Bonus of developer is:"+d.bonus);
}
}