class rectangle
{
	int length;
	int width;
	void insert(int l,int w)
	{
		length=l;
		width=w;
	}
	void calculate()
	{
	System.out.println(length*width);
	}
	public static void main(String ar[])
	{
		rectangle r1=new rectangle();
		rectangle r2=new rectangle();
		r1.insert(3,4);
		r2.insert(11,5);
		r1.calculate();
		r2.calculate();
		
		
	}
}