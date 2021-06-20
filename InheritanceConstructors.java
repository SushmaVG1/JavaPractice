class A
{
	int a;
	A() { a=0; }
	A(int a) { this.a=a; }
	void printData()
	{
		System.out.println("Base class method is called.\na = "+a);
		//System.out.println("a = "+a);
	}
}
class B extends A
{
	int b;
	B() { this.a=0; this.b=0; }
	//B(int a,int b) { this.a=a; this.b=b; }
	B(int a,int b)
	{
		super(a); //Base class constructor is called. 
		// super() has to be called before initiating derived class members.
		// super keyword can also be used to call base class methods 
		this.b=b;
	}
	void printAB()
	{
		super.printData();
		System.out.println("Derived class method is called.\na = "+a);
		System.out.println("Derived class method is called.\nb = "+b);
	}
}
class InheritanceConstructors
{
	public static void main(String [] args)
	{
		A objA=new A();
		B objB=new B();
		objB.a=10;
		objB.printAB();
	}
}
		 