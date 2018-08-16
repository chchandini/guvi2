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
		int n=sc.nextInt();
		int count=0,num=0;
		while(n>0)
		{
			int rem=n%10;
			num=num*10+rem;
			count++;
			n/= 10;
		}
		while(num>0);
		{
			int rem=num%10;
			if(count==1)
			System.out.println(rem);
			else
			System.out.println(rem);
			System.out.println(" ");
			count--;
		}
		num/= 10;

	}
}
