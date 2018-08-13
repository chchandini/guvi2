import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double pro=num1*num2;
		double sr=Math.sqrt(pro);
		if(sr-Math.floor(sr)==0)
			System.out.println("yes");
			else
			System.out.println("no");
	}
}
	
