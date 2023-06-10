package Talleres.Taller1.puntoBitcoin;

import java.util.Scanner;

public class BitcoinArreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        int[] precios = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            precios[i] = Integer.parseInt(input[i]);
        }
        
        
        int[] diasEspera = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            diasEspera[i] = 0;
            for (int j = i+1; j < input.length; j++) {
                if (precios[j] > precios[i]) {
                    diasEspera[i] = j-i;
                    break;
                }
            }
        }
        
        
        for (int i = 0; i < input.length; i++) {
           System.out.print(diasEspera[i]);
           if (i != input.length - 1) {
             System.out.print(" ");
           }
        }

        
    }

}
