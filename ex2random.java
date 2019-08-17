import java.util.Random;
class ex2random
{
	public static void main(String ar[])
	{
		Random ob = new Random();
		//return next pseudorandom integer value
		System.out.println("random integer value:"+ob.nextInt());
		//seed setting
		long seed=20;
		ob.setSeed(seed);
		System.out.println("seed value:"+ob.nextInt());
		
	}
}