interface CollegeInterface1
{
	void setCollegeName(String name);
}

interface CollegeInterface2 extends CollegeInterface1
{
	void printCollegeName();
}

class EngineeringCollege implements CollegeInterface2
{
	String colgName;
	public void setCollegeName(String name)
	{
		colgName=name;
	}
	public void printCollegeName()
	{
		System.out.println("College : " + colgName);
	}
}

class InterfaceInheritanceDemo
{
	public static void main(String[] args)
	{
		EngineeringCollege ec=new EngineeringCollege();
		CollegeInterface2 iFace=ec;
		iFace.setCollegeName("KLETech");
		iFace.printCollegeName();
	}
}

