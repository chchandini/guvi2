/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new scanner(System.in);
		int n=sc.nextInt();
		if(n%7==0)
		{
		System.out.println("yes");
		}
		{
		System.out.println("no");
		}
	}
}
