package HackerRank30days.Day15.listaEnlazadaHackerRank;

public class Node<D> {						// referencia campo dato
	Node <D> next;
    D data;										// referencia al siguiente nodo en la lista enlazada
//----------------------------------------------------------------------------------------------------------------------
	// constructors
	public Node(D newData) {
		data = newData;											// guarda dato del nodo
		next = null;									// siguiente apunta a null (no sabemos que nodo sigue)
	}

	public Node(D newData, Node newNext) {
		data = newData;											// guarda dato del nodo
		next = newNext;									// siguiente apunta a null (no sabemos que nodo sigue)
	}

//----------------------------------------------------------------------------------------------------------------------
    //methods

//----------------------------------------------------------------------------------------------------------------------
    //Getters and Setters
    public D getData(){
        return data;
    }

    public Node<D> getNext(){
        return next;
    }

    public void setData(D newData){
        data = newData;
    }

    public void setNext(Node<D> newNode){
        next = newNode;
    }

    

}
