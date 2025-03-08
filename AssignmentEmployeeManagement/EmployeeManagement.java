package AssignmentEmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
	
	public static void main(String [] args)
	{
		Employee emp1=new Employee(101, "Amar",100000);
		Employee emp2=new Employee(102, "vijay",50000);
		Employee emp3=new Employee(103, "Amar",30000);
		
		List<Employee> employees= new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		System.out.println("Employee Details: ");
		for(Employee emp: employees)
		{
			emp.displayDetails();
		}
	}

}
