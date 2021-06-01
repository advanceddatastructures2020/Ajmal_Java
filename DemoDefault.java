class A
{
	int data=40;
	void msg()
	{
		System.out.println("Hello Java");
	}
}
public class DemoDefault
{
	public static void main(String a[])
	{
		A obj=new A();
		System.out.println(obj.data);
		obj.msg();
	}
}
