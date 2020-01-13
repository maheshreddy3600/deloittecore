package utils;

import java.util.Scanner;

public class AccountOperations extends Account{
	boolean bool = false;
	boolean bool1 = false;
	double b;
Account[] accounts = new Account[5];
public AccountOperations() {
	accounts[0] = new Account(100,"A",100);
	accounts[1] = new Account(101,"B",200);
	accounts[2] = new Account(102,"C",300);
	accounts[3] = new Account(103,"D",400);
	accounts[4] = new Account(104,"E",500);

}
 void deposit(int accNo,double amount) {
	
	int l=accounts.length;
try{bool=false;
	for(int i=0;i<l;i++)
	{
	if(accNo==accounts[i].getAccNo())
	{
		bool=true;
		b = accounts[i].getBalance();
		b+=amount;
	accounts[i].setBalance(b);
	System.out.println("Current Balance: "+accounts[i].getBalance());
	}
}
	if (bool==false){
	throw new AccountNotFoundException();
	}
}
catch(AccountNotFoundException e){
	System.out.println(e.getMessage());
}
}
void withdraw(int acc1No,double amount){

	int l=accounts.length;
bool=false;bool1=false;
	for(int i=0;i<l;i++)
	{
		if(acc1No==accounts[i].getAccNo() && amount<accounts[i].getBalance())
		{
		bool=true;
		bool1=true;
		b = accounts[i].getBalance();
		b-=amount;
	accounts[i].setBalance(b);
	System.out.println("Current balance: "+accounts[i].getBalance());
	}
}try{
	if (bool==false){
	throw new AccountNotFoundException();
	}
}
catch(AccountNotFoundException e){
	System.out.println(e.getMessage());
}
try{
if (bool1==false)
	throw new InSufficientFundsException();
	
}
catch(InSufficientFundsException e2){
	System.out.println(e2.getMessage());
}
}


void checkBalance(int accNo){
	
	int l=accounts.length;
try{bool=false;
	for(int i=0;i<l;i++)
	{
	if(accNo==accounts[i].getAccNo())
	{
		bool=true;
		b = accounts[i].getBalance();
		
	
	System.out.println(b);
	}
}
	if (bool==false){
	throw new AccountNotFoundException();
	}
}
catch(AccountNotFoundException e){
	System.out.println(e.getMessage());
}
}
	}
