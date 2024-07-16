import java.util.*;
import java.io.*;

class employee{

	String first_name;
	String last_name;
	double salary;

	public employee(){
	String first_name="";
	String last_name="";
	double salary= 0;
		

}
	void getFirst_name(){
	System.out.println(first_name);
}
	 void setFirst_name(String fname){
	this.first_name=fname;
}
	void getLast_name(){
	System.out.println(last_name);
}
	void setLast_name(String lname){
	this.last_name=lname;	
}
	void getSalary(){
	System.out.println(salary);
}
	void setSalary(double newsalary){
	this.salary=newsalary;
}
	public void yersalary(double salary){
	double year_salary=salary*12;
	System.out.println(year_salary);
}
	public void hike_salary(double salary){
	System.out.println(salary*0.1);
}

}
public class program15{


	public static void main(String args[]){
				
	employee emp1=new employee();
	employee emp2=new employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First_name of employee");
	String emp1f1;
	emp1f1=sc.nextLine();
	System.out.println("Enter Last_name of employee");
	String emp1l1;
	emp1l1=sc.nextLine();
	System.out.println("Enter salary of employee");
	double emp1_sal;
	emp1_sal=sc.nextDouble();
	sc.nextLine();
	
	String emp2f2;
	String emp2l2;
	
	System.out.println("Enter firstname of employee2");
	emp2f2=sc.nextLine();
	System.out.println("Enter lastname of employee2");
	emp2l2=sc.nextLine();
	System.out.println("Enter salary of emp2");
	double emp2_sal=sc.nextDouble();
	
	emp1.setFirst_name(emp1f1);
	emp1.setLast_name(emp1l1);
	emp1.setSalary(emp1_sal);

	emp2.setFirst_name(emp2f2);
	emp2.setLast_name(emp2l2);
	emp2.setSalary(emp2_sal);
	
	System.out.println("First name of first emp :");emp1.getFirst_name();
	System.out.println("Last name of first emp :");emp1.getLast_name();
	System.out.println("Salary of first emp : ");emp1.getSalary();
	System.out.println("yearly salary of first emp : ");emp1.yersalary(emp1_sal);
	System.out.println("Salary of emp1 after hike : ");emp1.hike_salary(emp1_sal);

	System.out.println("First name of second emp : ");emp2.getFirst_name();
	System.out.println("Last name of second emp :");emp2.getLast_name();
	System.out.println("Salary of second emp : ");emp2.getSalary();
	System.out.println("yearly salary of second emp : ");emp2.yersalary(emp2_sal);
	System.out.println("Salary of emp2 after hike : ");emp2.hike_salary(emp2_sal);
                                                                           
}
}