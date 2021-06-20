import java.util.Scanner;

public class ExceptionDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter num1 and num2 : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		try{
		result=num1/num2;
		System.out.println("Result : " + result);
		//throw(e);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}