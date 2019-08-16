class box
{
	double width;
	double height;
	double depth;
	box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;

	}
	box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class test{
	public static void main(String ar[])
	{
		box ob=new box();
		box ob2=new box(10,20,30);
		double vol;
		vol=ob.volume();
		System.out.println(vol);
		System.out.println(ob2.volume());
	}
}

