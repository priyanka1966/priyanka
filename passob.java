class test
{
	int a,b;
	test(int i,int j)
	{
		a=i;
		b=j;
	}
	boolean equals(test o)
	{
		if(o.a==a&&o.b==b)
			return true;
		else
			return false;
	}
}
class passob
{
	public static void main(String ar[])
	{
		test ob1=new test(10,20);
		test ob2=new test(10,20);
		test ob3=new test(-1,-1);
		System.out.println("ob1==ob2:"+ob1.equals(ob2));
		System.out.println("ob1==ob1:"+ob1.equals(ob3));
	
	}
}