/*create class employee,declare variable empId,empName,basicSalary.,designationdeclare methods setData() to set the employee information. create method 
getAppraisal() method to calculate the incremenet appraisal.if any employee served minimum 1year,provide 10% increment. declare calculateTA() to calculate
travel allowance. if that employee designation is manager then 3000 ta else 1000 ta will be provided.create display() to display all the information.*/
package oopsprograms;
import java.util.Scanner;

class Employee
{
	int empId, empJoin,CurrYr;
	float basicSalary;
	String empName,Designation;
	public void setData(int CY,int id,String name,String role,int JY,float bs) 
	{
		CurrYr = CY;
		empId = id;
		basicSalary = bs;
		empJoin = JY;
		empName = name;
		Designation = role;
	}
	public float getAppraisal()
	{
		if(CurrYr-empJoin>1) {
			float Salary= basicSalary+(basicSalary*(10/100));
			return Salary;
		}
		else 
			return basicSalary;
	}
	public int TravelAllowance()
	{
		int TA=0;
		if(Designation.equals("manager")||Designation.equals("Manager")) 
			TA = 3000;
		else TA = 1000;
		return TA;
	}
	public void Display() 
	{
		System.out.println("Employee Id: "+ empId);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Employee Designation: "+Designation);
		float bs = getAppraisal();
		System.out.println("Employee Basic Salary: "+ bs);
		System.out.println("Employee Joining Year: "+ empJoin);
		int Travel = TravelAllowance();
		System.out.println("Employee Travel Allowence: "+Travel);
	}
}
public class EmployeeData 
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter Current Year: ");
		int CY = sc.nextInt();
		System.out.println("Enter Employee Id: ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = sc.next();
		System.out.println("Enter Employee Designation Role: ");
		String role = sc.next();
		System.out.println("Enter Employee Joining Year: ");
		int JY = sc.nextInt();
		System.out.println("Enter Employee Basic Salary: ");
		float bs = sc.nextInt();
		Employee emp= new Employee();
		emp.setData(CY, id, name, role, JY, bs);
		emp.Display();
	}
}
