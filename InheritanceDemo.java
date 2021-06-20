class A
{
	int a;
	void printA()
	{
		System.out.println("a = "+a);
	}
}
class B extends A
{
}
class InheritanceDemo
{
	public static void main(String [] args)
	{
		A objA=new A();
		B objB=new B();
		objB.a=10;
		objB.printA();
	}
}