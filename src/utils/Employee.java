package utils;

public class Employee {

	private int empcode;
	private String empname;
	private int empsalary;
	
	
	public Employee(int empcode, String empname, int salary) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.empsalary = salary;
	}


	public int getEmpcode() {
		return empcode;
	}


	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public int getEmpsalary() {
		return empsalary;
	}


	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}


	public static void main(String[] args) {
		
	}

}
