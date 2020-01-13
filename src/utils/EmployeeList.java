package utils;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int empcode = sc.nextInt();
		//String empname = sc.nextLine();
		//int empsalary = sc.nextInt();		
		ArrayList<Employee> emplist = new ArrayList<>();
		//emplist.add(new Employee(empcode,empname,empsalary));
		emplist.add(new Employee(101,"deloitte",5000));
		emplist.add(new Employee(102,"nexwave",7000));
		for(Employee emp :emplist)
			System.out.println(emp.getEmpcode()+" "+emp.getEmpname()+" "+emp.getEmpsalary());
	}

}
