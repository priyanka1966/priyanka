class Test
{
	void math(int i,int j)
	{
		i*=2;
		j/=2;
	}
}
class call_by_value{
	public static void main(String ar[])
	{	
		Test ob=new Test();
		int a=10;
		int b=20;
		System.out.println("before call:" +" "+ a +" "+b);
		ob.math(a,b);
		System.out.println("after call:" +" "+ a +" "+b);
	}
	
}