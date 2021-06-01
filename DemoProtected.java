class A
{
	protected int data=40;
	protected void msg()
	{
		System.out.println("Hello Java");
	}
}
public class DemoProtected
{
	public static void main(String a[])
	{
		A obj=new A();
		System.out.println(obj.data);
		obj.msg();
	}
}
