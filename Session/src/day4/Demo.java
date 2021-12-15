package day4;

public interface Demo 
{
	public void add();
	public void sub();
	default void display() 
	{
		System.out.println("Default method");
		
	}
	
	
	
}
