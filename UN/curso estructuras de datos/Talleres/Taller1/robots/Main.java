package Talleres.Taller1.robots;

//solo 56% toca arreglarlo, listas dobles pa

import java.util.Scanner;

public class Main {
  
  static class Pila {
    private int[] elementos;
    private int tamano;
    private int tope;
    
    public Pila(int tamano) {
      this.tamano = tamano;
      this.elementos = new int[tamano];
      this.tope = -1;
    }
    
    public boolean estaVacia() {
      return tope == -1;
    }
    
    public boolean estaLlena() {
      return tope == tamano - 1;
    }
    
    public void apilar(int elemento) {
      if (estaLlena()) {
        throw new RuntimeException("La pila está llena");
      }
      tope++;
      elementos[tope] = elemento;
    }
    
    public int desapilar() {
      if (estaVacia()) {
        throw new RuntimeException("La pila está vacía");
      }
      int elemento = elementos[tope];
      tope--;
      return elemento;
    }
    
    public int obtenerTope() {
      if (estaVacia()) {
        throw new RuntimeException("La pila está vacía");
      }
      return elementos[tope];
    }
     
    public void mostrarElementosPila() {
       int[] temp = new int[tope + 1];
       int i = 0;
       while (!estaVacia()) {
          temp[i++] = desapilar();
       }
       for (int j = temp.length - 1; j >= 0; j--) {
          boolean esUltimo = (j == 0);
          System.out.print(temp[j]);
          if (!esUltimo) {
              System.out.print(" ");
          }
       }
    }





 
 }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] input = scanner.nextLine().split(" ");
    int[] poderes = new int[input.length];
      
    int negativos = 0;
    int positivos = 0;  
    
    for (int i = 0; i < input.length; i++) {
        poderes[i] = Integer.parseInt(input[i]);
        if (poderes[i] > 0) {
          positivos++;
        } else if (poderes[i] < 0) {
          negativos++;
        }
        
    }
      
    Pila pilaIzq = new Pila(positivos);
    Pila pilaDer = new Pila(negativos);
    
    for (int i = 0; i < input.length; i++) {
        poderes[i] = Integer.parseInt(input[i]);
        if (poderes[i] > 0) {
          pilaIzq.apilar(poderes[i]);
        } else if (poderes[i] < 0) {
          pilaDer.apilar(poderes[i]);
        }
    }    
    
    
    while (!pilaIzq.estaVacia() && !pilaDer.estaVacia()) {
      int poderIzq = pilaIzq.obtenerTope();
      int poderDer = pilaDer.obtenerTope();
      
      if (poderIzq > (poderDer*-1)) {
        pilaDer.desapilar();
      } else if (poderIzq < (poderDer*-1)) {
        pilaIzq.desapilar();
      } else {
        pilaIzq.desapilar();
        pilaDer.desapilar();
      }
    }
    
    if (pilaIzq.estaVacia() && pilaDer.estaVacia()) {
      System.out.println("No quedaron robots!");
    } else if(!pilaIzq.estaVacia()) {
        pilaIzq.mostrarElementosPila();
      }
      else {
        pilaDer.mostrarElementosPila();
      }
    }
}