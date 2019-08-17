class charextraction
{
	public static void main(String ar[])
	{
		char ch;
		ch="abc".charAt(1);
		System.out.println(ch);
		/*extract more than one characer*/
		String s="this is a demo of the getchars method";
		int start=10;
		int end=14;
		char buf[]=new char[end-start];
		s.getChars(start,end,buf,0);
		System.out.println(buf);
	}
}