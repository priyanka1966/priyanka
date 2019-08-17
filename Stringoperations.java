import java.util.*;
class stringoperations
{
	public static void main(String ar[])
	{
		System.out.println("enter one string");//creation
		Scanner ob=new Scanner(System.in);
		String s=ob.nextLine();
		System.out.println("string:"+s);
		//length
		System.out.println("length:"+s.length());
		//extraction
		System.out.println("charAt():"+ s.charAt(1));
		int start=10;
		int end=14;
		char buf[]=new char[end-start];
		s.getChars(start,end,buf,0);
		System.out.println(buf);
		//comparison
		String s2="Hello";
		String s3="hello";
		System.out.println(s2 + "\tequals" + " \t"+s3 + "->" + s2.equals(s3));
		System.out.println(s2 + "\tequalsIgnoreCase"+"\t " + s3 + "->" + s2.equalsIgnoreCase(s3));
		System.out.println(s2 + "\tstartWith" +"H" +"\t"+s2.startsWith("H"));
		System.out.println(s2 + "\tendstWith" +"H" +"\t"+s2.endsWith("H"));
		System.out.println(s2 + "\tcompareTo" +"H" +""+s2.compareTo(s3));
		//searching
		System.out.println("indexOf(p)"+ s.indexOf('p'));
		System.out.println("lastIndexOf(p)"+ s.lastIndexOf('p'));
		//concate
		String s4=s2.concat("hi");
		System.out.println("concat\t"+s4);
		//replace
		System.out.println(s4.replace('h','H'));
		
		
		
		
		
		
		
	}
}