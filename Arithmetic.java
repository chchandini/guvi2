/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		import java.util.*;

class Series {
    public static void main(String args[]) {
        int a, d, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term of A.P");
        a = sc.nextInt();
        System.out.println("Enter difference");
        d = sc.nextInt();
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
        Series s1 = new Series();
        s1.lastTerm();
    }

    public int lastTerm(int s) {
        int a, d, n;
        s = a + (n - 1) * d;
        return s;
    }
}
