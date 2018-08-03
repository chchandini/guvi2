/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=newScanner(System.in);
		String str=sc.nextLine();
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
			System.out.println(count);
			
				

	}
}
