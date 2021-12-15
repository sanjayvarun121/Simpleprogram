package day4;

public class Demo1 extends Demo3 implements Demo
{
	

	public static void main(String[] args) 
	{
		Demo d=new Demo1();
		d.add();
		d.sub();
		d.display();
		Demo2 d1=new Demo3();
		d1.add();
		d1.sub();
		
		

	}

	@Override
	public void add() 
	{
		System.out.println("Addition");
		
		
	}

	@Override
	public void sub()
	{
		System.out.println("Subtraction");
		
	}

}
