import java.util.Scanner;
class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] data=new int[5];
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter data : ");
		for(int i=0;i<5;i++)
		{
			data[i]=Sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(data[i]);
		}
	}
}