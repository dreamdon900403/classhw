package java8hw;
class CCircle
{
	double pi=3.14;
	double radius;
	void show_periphery()
	{
	System.out.println("periphery="+2*pi*radius);
	}
}
public class class8_6 
{
	public static void main(String args[])
	{
		CCircle cirl=new CCircle();
		cirl.radius=3.0;
		cirl.show_periphery();
	}
}
