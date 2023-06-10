package HackerRank30days.Day18;

import java.util.LinkedList;

public class QueueyString<D> {

    LinkedList<D> queue;


    //Making a queue instance
    public QueueyString(){
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

    public void enqueue(D na){
        //agregamos al final de la linked
        //con un método ya hecho por java para las linked
        queue.addLast(na);
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
        QueueyString stringQueue = new QueueyString();
        
        stringQueue.enqueue("Hi");
        stringQueue.enqueue("There");
        System.out.print(stringQueue.dequeue()+" ");
        System.out.print(stringQueue.dequeue()+".");
       //SE CONVIRTIERON LAS COLAS A GENERICAS
        
    }
    
}
