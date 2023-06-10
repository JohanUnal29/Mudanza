package Parciales.Parcial1.punto2Electrodomesticos;

import java.util.Scanner;

class Queue{
    private String[] queueArr;
    private int sizeMax;
    private int forehead;
    private int end;
    private int numElems;
    
    Queue(int size) {
        sizeMax = size;
        queueArr = new String[sizeMax];
        end = -1;
        forehead = 0;
        numElems = 0;
    }
    
    void insert(String element) {
        if(end==sizeMax - 1) {
            end = -1;
        }
        end++;
        queueArr[end] = element;
        numElems++;
    }
    
    public String dequeue() {
        String temp = queueArr[forehead];
        forehead+=1;
        if(forehead==sizeMax) {
            forehead = 0;
        }
        numElems--;
        return temp;
    }
    
    String foreheadQueue() {
        return queueArr[forehead];
    }
    
    boolean queueEmpty() {
        return (numElems==0);
    }
    
    int tamano() {
        return numElems;
    }
    
}


public class punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue(100);
        
        int n = scanner.nextInt(); // cantidad de casos
        
        
        for (int i = 0; i < n; i++) { // cambiar límite de for a n
            
            int a = scanner.nextInt(); // cantidad de productos
            scanner.nextLine();
            String [] productos = scanner.nextLine().split(" ");
            int b = scanner.nextInt(); // cantidad de tiendas
            scanner.nextLine();
            String [] tiendas = scanner.nextLine().split(" ");
            
           
            for (String element : productos) {
                queue.insert(element);
            }
            int[] count = new int[tiendas.length];
            //convertir array
            for (int w = 0; w < tiendas.length; w++) {
                count[w] = Integer.parseInt(tiendas[w]);
            }
            //usar array y cola
            
            //b cantidad de tiendas
            for (int u = 0; u < b; u++) {
                 
               //count[u] cantidad de productos x ti[nda
               System.out.print("["); 
               for(int r=1;r<=count[u];r++){
                    if(!queue.queueEmpty()){
                            System.out.print(queue.dequeue());
                            if(r==count[u]||queue.queueEmpty()){
                                System.out.print(""); 
                            }else{
                                System.out.print(" "); 
                            }            
                    }
               }
               
               
               if (i == n - 1 && u == b - 1) {
                   System.out.print("]");
               } else {
                   System.out.println("]");
               }
    
            }
            
            while(!queue.queueEmpty()){        
                queue.dequeue();            
            }
            
        }   
        
    }
}
