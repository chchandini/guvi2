

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int p=lcm(m,n);
		System.out.println(p);
	}
		static int lcm(int m,int n)
		{
			return m*n/gcd(m,n);
		}
		static int gcd(int m,int n)
		{
			if(m==0||n==0)
			return 0;
			if(m==n)
			return m;
			if(m>n)
			return gcd(m-n,n);
			return gcd(m,n-m);
	}
}
	
