interface CallBack
{
	int x=10;
	void callBack(int param);
	void print();
}

class Client implements CallBack
{
	public void callBack(int param)
	{
		System.out.println("Client : " + param);
	}
}

class Client1 implements CallBack
{
	public void callBack(int param)
	{
		System.out.println("Client1 : " + param);
	}
}

class InterfaceDemo
{
	public static void main(String[] args)
	{
		Client obj=new Client();
		Client1 obj1=new Client1();
		CallBack c=obj;
		c.callBack(10);
		CallBack c1=obj1;
		c1.callBack(100);
	}
}