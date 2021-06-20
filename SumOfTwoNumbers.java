import java.util.Scanner;
class SumOfTwoNumbers
{
	public static void main(String[] args)
	{
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close()
		sum=a+b;
		System.out.println("Sum = "+sum);
	}
}