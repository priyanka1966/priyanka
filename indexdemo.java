class indexdemo
{
	
	public static void main(String ar[])
	{
		String s="now is the time for all good men";
		System.out.println(s);
		System.out.println("indexOf(t)" + s.indexOf('t'));
		System.out.println("lastindexOf(t)" + s.lastIndexOf('t'));
		System.out.println("indexOf(the)" + s.indexOf("the"));
		System.out.println("lastindexOf(the)" + s.lastIndexOf("the"));
		System.out.println("indexOf(t,10)" + s.indexOf('t',10));
		System.out.println("lastindexOf(t,20)" + s.lastIndexOf('t',20));
		
		
	}
}