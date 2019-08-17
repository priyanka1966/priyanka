import java.util.Random;
class exrandom
{
	public static void main(String ar[])
	{
		//create random object
		
		Random ob=new Random();		
		System.out.println("long values:" + ob.longs());
		
		boolean val=ob.nextBoolean();
		System.out.println("Random boolean value:" + val);

		byte[] bytes=new byte[10];
		ob.nextBytes(bytes);
		System.out.println("random bytes:");
		for(int i=0;i<bytes.length;i++)
		{
			System.out.printf("%d\t",bytes[i]);
		}
	}
}