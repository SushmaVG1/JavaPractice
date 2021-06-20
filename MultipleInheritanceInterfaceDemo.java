interface CollegeInterface1
{
	void setCollegeName(String name);
}

interface CollegeInterface2 extends CollegeInterface1
{
	void printCollegeName();
}

interface LocationInterface
{
	void setLocation(String loc);
	void printLocation();
}

interface MessageInterface
{
	void setMessage(String m);
	String getMessage();
}

interface CollegeMessage extends LocationInterface,MessageInterface
{
	void printMessage();
}

class EngineeringCollege implements CollegeInterface2,CollegeMessage
{
	String colgName;
	String message;
	String location;
	public void setCollegeName(String name)
	{
		colgName=name;
	}
	public void printCollegeName()
	{
		System.out.println("College : " + colgName);
	}
	public void setMessage(String m)
	{
		message=m;
	}
	public String getMessage()
	{
		return message;
	}
	public void printMessage()
	{
		System.out.println("Message : " + message);
	}
	public void setLocation(String loc)
	{
		location=loc;
	}
	public void printLocation()
	{
		System.out.println("Location : " + location);
	}
}

class MultipleInheritanceInterfaceDemo
{
	public static void main(String[] args)
	{
		EngineeringCollege ec=new EngineeringCollege();
		CollegeInterface1 iFace1=ec;
		CollegeInterface2 iFace2=ec;
		CollegeMessage cMess=ec;
		/*ec.setCollegeName("KLETech");
		ec.printCollegeName();
		ec.setLocation("Hubli");
		ec.printLocation();
		ec.setMessage("Hello");
		ec.printMessage();*/
		iFace1.setCollegeName("KLETech");
		iFace2.printCollegeName();
		//cMess.printCollegeName(); Since CollegeMessage Interface doesn't have printCollegeName() method this line gives error
	}
}

