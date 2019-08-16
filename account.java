class account
{
	int acc_no;
	String name;
	float amount;
	void insert(int a,String n,float amt)
	{
		acc_no=a;
		name=n;
		amount=amt;
	}
	void deposit(float amt)	
	{
		amount=amount+amt;
		System.out.println(amount+"deposited");
	}
	void withdraw(float amt)
	{
		if(amt>amount)
		{
			System.out.println("insufficient balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"withdraw");
		}
	}
	void checkbalance()
	{
	System.out.println("balance is"+amount);
	}
	void display()
	{
		System.out.println(acc_no+" "+name+" "+amount);
	}
	public static void main(String ar[])
	{
		account a1=new account();
		a1.insert(161966,"priyanka",1345);
		a1.display();
		a1.checkbalance();
		a1.deposit(1000);
		a1.withdraw(500);
		a1.checkbalance();
	}
}
	