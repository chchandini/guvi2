/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  package projetppc;

import java.util.Arrays;
import javax.swing.SortingFocusTraversalPolicy;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solution;
import org.chocosolver.solver.variables.IntVar;

public class ProjetPPC {

    public void modelAndSolve() {

        int k = 9;
        int htpj = 12;
        int h = 4;
        int H = 6;
        int C = 2;
        int HT = 42;

        Model model = new Model(k + "- CAT");

        int[] numOfemp = {1, 2, 4, 5, 5, 4, 5, 5, 3, 4, 2, 2};

        IntVar[][] matrix = new IntVar[k][htpj];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < htpj; j++) {
                matrix[i][j] = model.intVar("(" + i + "," + j + ")", 0, 1);

            }

        }


        model.arithm(matrix[0][0], "=", 1).post();

        int[] coeffs1 = new int[htpj];
        Arrays.fill(coeffs1, 1);

        // constraint 1 et 2
        for (int i = 0; i < k; i++) {
            model.scalar(matrix[i], coeffs1, "<=", H).post();
            model.scalar(matrix[i], coeffs1, ">=", h).post();
        }
        int[] coeffs2 = new int[k];
        Arrays.fill(coeffs2, 1);


        IntVar[][] inversematrix = new IntVar[htpj][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < htpj; j++) {
                inversematrix[j][i] = matrix[i][j];
            }

        }
        // constraint
        for (int i = 0; i < htpj; i++) {
            model.scalar(inversematrix[i], coeffs2, "=", numOfemp[i]).post();

        }

        // constraint
        IntVar[] alltable = new IntVar[k * htpj];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < htpj; j++) {
                alltable[(htpj * i) + j] = matrix[i][j];
            }
        }

        int[] coeffs3 = new int[k * htpj];
        Arrays.fill(coeffs3, 1);
        model.scalar(alltable, coeffs3, ">=", HT).post();
        model.scalar(alltable, coeffs3, "<=", HT + C).post();




        // solution
        Solution solution = model.getSolver().findSolution();
        if (solution != null) {
            for (int i = 0; i < k; i++) {

                System.out.println("employé " + i + " " + Arrays.toString(matrix[i]));

            }


        } else {

            System.out.println("Pas de solution.");
        }
    }

     public static void main(String[] args) {
        new ProjetPPC().modelAndSolve();
    }
}
