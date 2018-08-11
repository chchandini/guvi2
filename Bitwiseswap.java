/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int a = 89, b = 90;
System.out.println("Before swapping:");
 
System.out.println("A=" + a);
System.out.println("B=" + b);
 
a = a ^ b; // XOR operation
b = a ^ b; // XOR operation
a = a ^ b; // XOR operation
 
System.out.println("After swapping:");
System.out.println("A=" + a);
System.out.println("B=" + b);
}
	}
