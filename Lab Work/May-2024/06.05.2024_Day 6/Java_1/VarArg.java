package xyz;
import java.lang.*;

public class VarArg
{	
	void display(int... a) 
	{
		System.out.println("Namaste Bhawuk!");
		System.out.println(a[0]);
	}	

	public static void main(String[] arg)
	{
		VarArg v1 = new VarArg();
		v1.display();
		v1.display(42);
		v1.display(29, 19, 42);
	}
}