/*string creation*/
import java.util.*;
class create
{
	public static void main(String arg[])
	{
		String s=new String();
		s="hello";
		System.out.println(s);
		String s1=new String("hi");
		System.out.println(s1);
		char str[]={'w','e','l','c','o','m','e'};
		String s2=new String(str);
		System.out.println(s2);
		String s3=new String(str,3,3);
		System.out.println(s3);
		Scanner ob=new Scanner(System.in);
		String s4=ob.nextLine();
		System.out.println(s4);
		
	}
}