class BankAccount
{
	int accNo;
	double accBal;
	String custName;
	void debitAmt(double amt)
	{
		accBal-=amt;
	}
	void creditAmt(double amt)
	{
		accBal+=amt;
	}
	void transferAmt(BankAccount to,BankAccount from,double amt)
	{
		from.accBal-=amt;
		to.accBal=+amt;
	}
	void printDetails()
	{
		System.out.println(accNo+":"+accBal+":"+custName);
	}
	BankAccount()
	{
		accNo=0;
		accBal=0;
		custName=" ";
	}
	BankAccount(int a,double b,String n)
	{
		accNo=a;
		accBal=b;
		custName=n;
	}
}
//Starter Class
class BankAccountDemo
{
	public static void main(String [] args)
	{
		BankAccount ba1;
		ba1=new BankAccount();
		BankAccount ba2=new BankAccount(1001,1000,"Sushma");
		System.out.println("Main Function Executed\n");
		System.out.println(ba2.accNo);
		ba2.debitAmt(100);
		ba2.printDetails();
		ba2.creditAmt(600);
		ba2.printDetails();
	}
}