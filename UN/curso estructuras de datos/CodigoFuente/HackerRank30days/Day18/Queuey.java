package HackerRank30days.Day18;

import java.util.LinkedList;

public class Queuey<D> {
    
    LinkedList<D> queue;


    //Making a queue instance
    public Queuey(){
        queue = new LinkedList();
    }

    //Is our queue empty?
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //tamaño
    public int size(){
        return queue.size();
    }

    //agregar al final
    public void enqueue(D n){
        //agregamos al final de la linked
        //con un método ya hecho por java para las linked
        queue.addLast(n);
    }

    //desencolar
    public D dequeue(){
        //es cero para eliminar siempre el elemento en index 0 de la lista(cola)
        return queue.remove(0);
    }

    //devolver el primer item
    public D peek(){
        return queue.get(0);
    }

    public static void main(String[] args){
        Queuey numberQueue = new Queuey();
        
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First Out: "+numberQueue.dequeue());
        System.out.println("Peek at second item: "+numberQueue.peek());
        System.out.println("Second Out: "+numberQueue.dequeue());
        System.out.println("Third Out: "+numberQueue.dequeue());
        //SE CONVIRTIERON LAS COLAS A GENERICAS
    }

}
