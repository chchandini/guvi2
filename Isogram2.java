
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int count=0;
		for(int i=0;i<st.length()-1;i++)
		{
			if(st.charAt(i)==st.charAt(i+1))
			{
				count++;
			}
		}
			if(count==0)
			System.out.println("yes");
			else
			System.out.println("no");
		}
}
		
	

	
	
