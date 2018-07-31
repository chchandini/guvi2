/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		public class SelectTopSum {
    public static void main(String[] args){
        int[] arr = {5,2,10,1,33};
        int target=33;

        System.out.println(Arrays.toString(selectTop(arr, target)));
    }

    private static int[] selectTop(int[] arr, int sum) {
        //get max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        int runningTot=0;

        for (int i : arr) {
            if (runningTot<sum) {
                runningTot+=i;
                pq.add(i);
            }
            else if (i > pq.peek()) {
                runningTot-=pq.remove();
                runningTot+=i;
                pq.add(i);
            }
            while (runningTot-pq.peek()>=sum) {
                runningTot-=pq.remove();
            }
        }

        //System.out.println("priority queue is "+ pq);

        int[] result=new int[pq.size()];
        int i=0;
        while (!pq.isEmpty()) {
            result[i]=pq.remove();
            i++;
        }
        return result;
    }
}
java 
	}
}
