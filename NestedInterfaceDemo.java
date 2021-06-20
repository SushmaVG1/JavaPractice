class A
{
	public interface IFace
	{
		void callBack(int p);
	}
}

class B implements A.IFace
{
	public void callBack(int p)
	{
		System.out.println("CallBack : " + p );
	}
}

class NestedInterfaceDemo
{
	public static void main(String [] args)
	{
		B iFace=new B();
		iFace.callBack(10);
	}
}