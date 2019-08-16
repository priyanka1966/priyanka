class Test
{
	int a,b;
	Test(int i,int j)
	{
		a=i;
		b=j;
	}
	void math(Test o)
	{
		o.a*=2;
		o.b/=2;
	}
}
class call_by_reference{
	public static void main(String ar[])
	{	
		Test ob=new Test(15,30);
		System.out.println("before call:" +" "+ ob.a +" "+ob.b);
		ob.math(ob);
		System.out.println("after call:" +" "+ ob.a +" "+ob.b);
	}
	
}