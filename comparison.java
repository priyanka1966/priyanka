class comparison
{
	public static void main(String ar[])
	{
		String s1="hello";
		String s2="hello";
		String s3="good-bye";
		String s4="Hello";
		System.out.println(s1 + "equals "+ s2 + "->"+ s1.equals(s2));
		System.out.println(s1 + "equals "+ s3 + "->" + s1.equals(s3));
		System.out.println(s1 + "equals "+ s4 + "->" + s1.equals(s4));
		System.out.println(s1 + "equalsIgnorecase"+ s4 + "->" + s1.equalsIgnoreCase(s4));
		
	}
}