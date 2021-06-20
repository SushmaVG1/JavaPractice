class A
{
	static int x;
	static
	{
		x=0;
		System.out.println("Static block is executed");
	}
	static void showData()
	{
		System.out.println(x);
	}	
}
class StaticDemo
{
	public static void main(String [] args)
	{
		A.showData();
		A.x=10;
		A.showData();
	}
}