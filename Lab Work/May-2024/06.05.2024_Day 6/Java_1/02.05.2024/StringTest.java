package xyz;
import java.lang.*;
import java.util.Scanner;

public class StringTest
{
	public static void main(String[] arg)
	{
		// String s1 = "Bhawuk";
		StringBuffer s2 = new StringBuffer("Bhawuk Arora");
		s2.append("Arora");
		StringBuffer s3 = new StringBuffer("Bhawuk Arora");
		s3.append("Arora");
		
		System.out.println("Enter your name - ");
     		Scanner sc = new Scanner(System.in);
    		String name = sc.nextLine();
		System.out.println(name.toUpperCase());

		System.out.println("Enter your roll number - ");
		int roll_num = sc.nextInt();

	}
}