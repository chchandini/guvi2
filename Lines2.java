/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a;
		int count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		String b[]=a.split("\\.");
		for(int i=0;i<b.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}
}
