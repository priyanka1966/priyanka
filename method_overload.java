class overloaddemo
{
	void test()	
	{
		System.out.println("no parameters");
	}
	void test(int a)
	{
		System.out.println("a: "+ a);
	}
	void test(int a,int b)
	{
		System.out.println(a +" " +b);
	}
	void test(double a)
	{
		System.out.println(a);
	}
}
class method_overload
{
	public static void main(String arg[])
	{
		overloaddemo ob=new overloaddemo();
		ob.test();
		ob.test(10);
		ob.test(10,20);
		ob.test(23.54);
	}
}
