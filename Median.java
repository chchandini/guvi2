/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		public class whileloopq extends Applet implements ActionListener
{
    Label label;
    TextField input;
    int num;
    int index;
    int[] numArray = new int[20];
    int sum;
    int total;
    double avg;
    int median;



    public void init ()
    {
        label = new Label("Enter numbers");
        input = new TextField(5);
        add(label);
        add(input);
        input.addActionListener(this);
        index = 0;
    }

    public void actionPerformed (ActionEvent ev)
    {
        int num = Integer.parseInt(input.getText());
        numArray[index] = num;
        index++;
        if (index == 20)
        input.setEnabled(false);
            input.setText("");
        sum = 0;
        for (int i = 0; i < numArray.length; i++)
        {
            sum += numArray[i];
        }
        total = sum;
        avg = total / index;

        median = numArray[numArray.length/2];



        repaint();

    }



    public void paint (Graphics graf)
    {



        graf.drawString("Total   = " + Integer.toString(total), 25, 85);
        graf.drawString("Average = " + Double.toString(avg), 25, 100);
        graf.drawString("Median = " + Integer.toString(median), 25, 115);



    }
}

	}
}
