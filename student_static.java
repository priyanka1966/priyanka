class student
{
	int rollno;
	String name;
	static String college="IIIT";
	student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	static void change()
	{
		college="RGUKT";
	}
	public static void main(String ar[])
	{
		student.change();
		student s1=new student(966,"priya");
		s1.display();
	}
}