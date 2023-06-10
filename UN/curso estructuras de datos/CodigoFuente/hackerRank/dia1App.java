package hackerRank;

import java.util.Scanner;

public class dia1App {
    public static void main(String[] args) {
        int  a;
        double b;
        String c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextDouble();
        scan.nextLine(); 
        c = scan.nextLine();

        int numeroEntero = (int) b;
        int S = a+numeroEntero;
        double S2 = b+b;
        
        System.out.println(S);
        System.out.println(S2);
        System.out.println("HackerRank "+c);
        
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
