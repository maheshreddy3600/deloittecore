package test;

public class UserDefinedExample {
	
	public static void main(String[] args) {
	
		int empcode = 123;
		int code = Integer.parseInt(args[0]);
		try{
			if(code!=empcode)
				throw new EmployeeNotFoundException();
			System.out.println("employee Exist");
		}
		catch(EmployeeNotFoundException e){
			System.out.println(e.getMessage());
		}
	}

}
