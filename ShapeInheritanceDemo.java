class Shape
{
	double dim1;
	double dim2;
	Shape() { dim1=0; dim2=0; }
	Shape(double d1,double d2) { dim1=d1; dim2=d2; }
	double findArea()
	{
		return 0;
	}
	void printShape()
	{
		System.out.println("Dimensions : "+dim1+" * "+dim2);
	}
}
class Rectangle extends Shape
{
	Rectangle() { super(); }
	Rectangle(double d1,double d2) { super(d1,d2); }
	double findArea() { return dim1*dim2; }
	void printShape() { super.printShape(); }
}
class Triangle extends Shape
{
	Triangle() { super(); }
	Triangle(double d1,double d2) {super(d1,d2); }
	double findArea() { return 0.5*dim1*dim2; }
	void printShape() { super.printShape(); }
}
class ShapeInheritanceDemo
{
	public static void main(String [] args)
	{
		Shape s=new Shape();
		Rectangle r=new Rectangle(5,4);
		s=r;
		double area=s.findArea();
		System.out.println("Area : "+area);
		Triangle t=new Triangle(3,2);
		s=t;
		area=s.findArea();
		System.out.println("Area : "+area);
	}
}
	