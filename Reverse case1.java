/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String h=s.nextLine();
		for(int i=0;i<h.length();i++)
		{
			if(Character.isUpperCase(h.charAt(i)))
			{
				System.out.print(Character.toLowerCase(h.charAt(i)));
			}
			if(Character.isLowerCase(h.charAt(i)))
			{
				System.out.print(Character.toUpperCase(h.charAt(i)));
			}
		}
	}																		
}
