package POO_P_ATS.clase62ConceptoyCreaciondemetodos;

import javax.swing.JOptionPane;

public class Operacion {

    //void método que no retornará nada

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Métodos

    //Método para pedir números al user
    public void leeNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
    }

    //Método para sumar
    public void sumar(){
        suma = numero1+numero2;
    }

    //Método para restar
    public void restar(){
        resta = numero1-numero2;
    }

    //Método para multiplicar
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }

    //Método para dividir
    public void dividir(){
        division = numero1/numero2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multi es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }

}
