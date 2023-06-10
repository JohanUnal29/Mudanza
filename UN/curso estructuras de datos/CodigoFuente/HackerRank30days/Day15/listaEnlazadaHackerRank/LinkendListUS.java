package HackerRank30days.Day15.listaEnlazadaHackerRank;

import java.util.LinkedList;

public class LinkendListUS<D> {
    //Properties
    Node <D> head;
    int count;

    //Constrictors
    // public LinkendList(){
    //     head = null;
    //     count = 0;
    // }

    public LinkendListUS(Node<D> newHead){
        head = newHead;
        count = 1;
    }

    //Methods

    //add
    public void add(D newData){
        Node<D> temp = new Node(newData);
        //inicia desde la cabeza recorriendo toda la lista hasta el final y meterse ahí
        Node<D> current = head;
        //recorremos con un bucle while y el current
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }   

    //get

    public D get(int index){
        // if(index <= 0){
        //     return -1;
        // }
        Node<D> current = head;
        // I INICIA EN 1 PORQUE SI FUERA EN 0 DA ES LA CABEZA OSEA SE CORRE 1
        //ya que si no fuera así al meter por ejemplo 6 y i=0 entonces nos daría el elemnto 5
        for(int i=1; i<index; i++){
            current = current.getNext();
        }
        //devuelve el dato del nodo ubicado en el index requerido
        return current.getData();
    }

    //size
    public int size(){
        return count;
    }

    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    //remove

    public void remove(){
        //remvoer desde la cola
        Node<D> current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        //PROBANDO LAS LISTAS YA CREADAS EN JAVA
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        System.out.println(linkedlist);
        linkedlist.add("AliceAr");
        System.out.println(linkedlist);
    }
}
