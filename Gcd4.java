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
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=gcd(a,b);
		System.out.println(c);
	}
	static int gcd(int a,int b)
	{
		if(a==0||b==0)
			return 0;
		if(a==b)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a,b-a);

	
	}
}
