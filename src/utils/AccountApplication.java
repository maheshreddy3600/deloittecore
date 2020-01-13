package utils;

import java.util.Scanner;

public class AccountApplication extends AccountOperations {
	public static void main(String[] args) {
		AccountOperations oper = new AccountOperations();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an option: ");
		int x=sc.nextInt();
		switch(x){	
		case 1:
			System.out.println("Enter bank account n.o: ");
			int m= sc.nextInt();
			System.out.println("Enter amount to be deposited: ");
			double n=sc.nextDouble();
			oper.deposit(m,n); break;
		case 2: System.out.println("Enter bank account n.o: ");
		int k= sc.nextInt();
		System.out.println("Enter amount to be deposited: ");
		double l=sc.nextDouble();
		oper.withdraw(k,l); break;
		case 3:System.out.println("Enter bank account n.o: ");
		int w= sc.nextInt();
			oper.checkBalance(w);break;
		default: System.out.println("Invalid option");
	}
	}
}
