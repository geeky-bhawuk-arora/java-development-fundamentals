package xyz;
import java.lang.*;

public class VarArg
{	
	public void display() 
	{
		System.out.println("Namaste Bhawuk!");
	}

	public static void main(String[] arg)
	{
		VarArg v1 = new VarArg();
		v1.display();
	}
}