/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		class CountNumberOfLinesAndWordsInAParagraph
{    public static void main(String s[])
    {
        String paragraph = "Java's primary motivation was platform independence and not internet.\r\nPlatform independence means the ability to write a program on one platform and run\r\nit on any other platform without worrying about the platform specific features. If it works on one platform,\r\nit should work on all other platforms.";
        System.out.println("The Paragraph details are : " + getParagraphDetails(paragraph));

    }


public static ParagraphDetails getParagraphDetails(String paragraph) { 
//Write code here to get the number of lines and number of words and return them. 
} 
} 
class ParagraphDetails { 

int lines; 
int words; 

public ParagraphDetails(int lines, int words) { 
this.lines = lines; 
this.words = words; 
} 

@Override 
public String toString() { 
return "Lines = " + lines + ", " + "Words = " + words; 
} 
} 

	}
}
