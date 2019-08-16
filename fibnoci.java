import java.util.*;
class fibnoci
{
	int n;
	
	void fib()
	{
		int a=0,b=1,c,count=0;
		while(count<n)
		{
			
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+"\t");
			count++;
		}
		System.out.println(n+"th fibnoci number:"+a);
	}
	
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		int no=ob.nextInt();
		fibnoci fob=new fibnoci();
		fob.n=no;
		fob.fib();
		
	}
}