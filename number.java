import java.util.*;
class number
{
	int n;
	boolean prime()
	{
		int c=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
			return true;
		else 
			return false;
	}
	void print()
	{		
		int c;
		for(int i=1;i<=n;i++)
		{
			c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			{	System.out.println(i);
				
			}
			
		}	
	}
	void nthprime()
	{
		int c,i=1,count=0;
		
		while(true)
		{	
			c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
				count++;
			if(count==n)
				System.out.println("nth primeno:"+i);
				break;	
			}
			i++;

	}
	
}
class assignmnt
{
	
	public static void main(String ar[])
	{
		number nob=new number();
		Scanner ob=new Scanner(System.in);
		nob.n=ob.nextInt();
		boolean val=nob.prime();
		if(val==true)
		{	
			nob.print();
		}
		nob.nthprime();

		
		
		

	}
}