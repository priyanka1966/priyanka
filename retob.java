class Test
{
	int a;
	Test(int i)
	{
		a=i;
	}
	Test incrementby()
	{
		Test temp=new Test(a+10);
		return temp;
	}
}
class retob{
	public static void main(String ar[])
	{
		Test ob1=new Test(2);
		Test ob2;
		ob2=ob1.incrementby();
		System.out.println("ob1.a:" + ob1.a);
		System.out.println("ob2.a:"+ ob2.a);
	}
}