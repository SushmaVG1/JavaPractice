import java.util.Scanner;
class TwoDArrayDemo
{
	public static void main(String[] args)
	{
		int[][] data=new int[3][2];
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter data: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				data[i][j]=Sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(data[i][j]);
			}
		}
	}
}