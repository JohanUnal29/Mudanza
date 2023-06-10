package Parciales.Parcial1.punto1Desarrolladores;


import java.util.Scanner;

class Stack{
    private String[] arregloPila;
    private int cima;
    private int tamanoPila;
    
    Stack(int tamano) {
       this.tamanoPila = tamano;
       cima = -1;
       arregloPila = new String[tamanoPila];
    }
    
    void insert(String elemento) {
       cima+=1;
       arregloPila[cima]=elemento;
    }
    
    String quitar() {
       String temp = arregloPila[cima];
       cima-=1;
       return temp;
    }
    
    String cimaPila() {
       return arregloPila[cima];
    }
    
    boolean pilaVacia() {
       return cima==-1;
    }
    
    
    int tamano() {
       return cima + 1;
    }
    
}

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insert(String data) {
    Node node = new Node(data);
    if (head == null) {
        head = node;
    } else {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
   }

   
    
    Node search(String value) {
    Node current = head;
    while (!current.data.equals(value)) {
        if(current.next == null) {
            return null;
        }else{
            current = current.next;
        }
      }
    return current;
    }
    
}

public class punto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        Stack stack = new Stack(100);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            list.insert(scanner.next());
        }
        
        int a = scanner.nextInt();//cantidad de personas
        int z = 0;//contador
        int personas = 0;//contador de personas aptas
        int habilidades = 0;
        
        
        for (int i = 0; i <= a; i++) {
            String [] data = scanner.nextLine().split(" ");
            for (String element : data) {
                stack.insert(element);
            }
  
            while(stack.pilaVacia()!=true){
               if(list.search(stack.cimaPila())!=null){
                   habilidades ++;
                   stack.quitar();
               }else{
                   stack.quitar();
               }
            }
            
            if(habilidades==n){
                personas++;
            }
            data = new String[0]; // vaciar el arreglo
            habilidades = 0;
        }
        
        System.out.print(personas);
        
                
    }
}
