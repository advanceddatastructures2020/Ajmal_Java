public class ArrayObject
{
	public static void main(String arg[])
	{
		Pdt ob[] = new Pdt[5];
		ob[0] = new Pdt(1, "Pen");
		ob[1] = new Pdt(2, "Pencil");
		ob[2] = new Pdt(3, "Scale");
		ob[3] = new Pdt(4, "Book");
		ob[4] = new Pdt(5, "Stapler");
		
		System.out.println("Pdt object 1");
		ob[0].display();
		System.out.println("Pdt object 2");
		ob[1].display();
		ob[2].display();
		ob[3].display();
		ob[4].display();
		for(int i=0; i<5; i++)
		{
			System.out.println(ob[i].display());
		}
	}
	
}

 
class Pdt{
	int pdtId;
	String pdtName;
	Pdt(int pid, String pname)
	{
		pdtId = pid;
		pdtName = pname;
	}
	public void display()
	{
		System.out.println("Product Id" + pdtId + "Product Name" + pdtName);
	}
}

		