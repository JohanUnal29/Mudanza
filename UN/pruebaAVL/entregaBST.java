//CABE ACLARAR QUE SE USA BST + LA TECNICA LEVEL ORDER


// Islas Galápagos
// ## Enunciado del problema

// Un grupo de estudiantes de botánica están interesados en innovar. Para eso, deciden hacer un viaje a la isla Wolf (que es una de las Islas Galápagos que solo se puede visitar para quienes tienen fines de investigación o quieren hacer buceo profesional, no para turistas). Este viaje es naturalmente muy costoso y deben sacarle el mayor provecho. Van a ir a investigar sobre una nueva especie de insecto que vive en las copas de los árboles, pero como la isla tiene más de 1.5 kilómetros cuadrados, deben maximizar el proceso de toma de muestras. El proceso de la toma de muestras está organizado en n zonas distribuidas a través de las islas, donde cada zona tiene una cantidad esperada de insectos a recolectar i.

// La idea entonces es recibir la lista de las n cantidades de insectos esperados por zona y agregarlos en level order (https://www.geeksforgeeks.org/create-a-tree-in-level-order/). En la contrucción de este árbol encontrará valores en el rango [-1, 25]. El valor -1 es utilizado para representar NULL(es decir, que ese nodo no existe y por ahí no puede hacerse la expedición). Los demás valores diferentes de -1 son valores que sí hacen referencia a la cantidad esperada de insectos.

// La expedicción comienza en el cráter del volcán Wolf, que es la primera zona en la lista anterior y representa la raíz del árbol binario creado anteriormente. Como no se tienen los recursos para pasar por cada uno de los nidos de insectos solo se puede pasar por a nodos. Entonces uno de los estudiantes propone 3 maneras de realizar la expedición: Recorrido inorder, preorder y postorder. El estudiante propone visitar los primeros a nodos en cada recorrido, pero no cuenta con un computador en la Isla para realizar los cálculos.

// Su misión entonces es ayudar al estudiante a encontrar el mejor recorrido que puede hacer (Inorder, preorder o postorder) y la cantidad esperada de insectos que podrá recolectar en dicho recorrido.

// Tenga en cuenta además que si hay dos recorridos que tienen el mismo número de insectos esperados, se tendrá en cuenta el siguiente criterio de preferencia: Preorder - Inorder - Postorder.

// Por ejemplo: https://drive.google.com/file/d/18TxsYbe6RYUnZjSADTQU-DKKwiau_mrL/view?usp=share_link

// ## Restricciones

// El árbol binario de entrada es un árbol binario completo con niveles entre 3 y 12.
// Los valores de cada nodo están entre 0 y 25 con la restricción de que -1 representa NULL.
// ## Entrada

// En la primera línea va la lista ordenada de posibles insectos por zona (el primer elemento es la raíz del árbol). Hay suficientes elementos por cada entrada para tener un árbol binario completo en su último nivel. En la segunda línea va el número de nodos a que se deben visitar. |

// ## Salida

// Inicialmente va la salida dice el mejor recorrido a realizar, con la primera letra en mayúscula ("Preorder", "Inorder", "Postorder") Luego, separado por un espacio, va la cantidad máxima de insectos que se pueden recolectar en la expedición


// ## Ejemplos


// Entrada Ejemplo 1

// 4 20 10 -1 16 4 0
// 4
// Salida Ejemplo 1

// Preorder 50

// ## Notas

// La salida no debe tener un caracter de nueva línea al final del archivo, de lo contrario puede recibir el veredicto de respuesta incorrecta.


import java.util.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int value) {
        key = value;
        left = null;
        right = null;
    }
};

class ArbolLevelOrder {
    Node root = null;
    Queue<Node> q = new LinkedList<>();
    List<Integer> firstFourElements = new ArrayList<>();
    int sumaPreOrder1 = 0;
    int sumaInOrder1 = 0;
    int sumaPostOrder1 = 0;
    
    Node newNode(int value) {
        return new Node(value);
    }

    void insertValue(int value) {
        Node node = newNode(value);
        if (root == null)
            root = node;
        else if (q.peek().left == null)
            q.peek().left = node;
        else {
            q.peek().right = node;
            q.remove();
        }
        q.add(node);
    }

    void createTree(int arr[], int n) {
        for (int i = 0; i < n; i++)
            insertValue(arr[i]);
    }

    void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> n = new LinkedList<>();
        n.add(root);
        while (!n.isEmpty()) {
            Node current = n.poll();
            System.out.print(current.key + " ");
            if (current.left != null)
                n.add(current.left);
            if (current.right != null)
                n.add(current.right);
        }
    }

    void preOrder(Node node) {
        if (node == null)
            return;

        // Add the first 4 elements to a list.
        if(node.key!=-1){
            firstFourElements.add(node.key); 
        }   
     
        // Recursively call the preOrder method on the left and right subtrees.
        preOrder(node.left);
        preOrder(node.right);
    }
    
    void sumaPreOrder(int a){
            // Print the first 4 elements.
        preOrder(root);
        for(int i=0;i<a;i++){
            sumaPreOrder1 += firstFourElements.get(i);
        }
        
        firstFourElements.clear();
    }

    void inOrder(Node node) {
        if (node == null)
            return;
               
        inOrder(node.left);
        if(node.key!=-1){
            firstFourElements.add(node.key); 
        }   
        inOrder(node.right);
    }
    
    void sumaInOrder(int a){
            // Print the first 4 elements.
        inOrder(root);
        for(int i=0;i<a;i++){
            sumaInOrder1 += firstFourElements.get(i);
        }
        
        firstFourElements.clear();
    }

    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        if(node.key!=-1){
            firstFourElements.add(node.key); 
        }   
    }
    
    void sumaPostOrder(int a){
            // Print the first 4 elements.
        postOrder(root);
        for(int i=0;i<a;i++){
            sumaPostOrder1 += firstFourElements.get(i);
        }
        
        firstFourElements.clear();
    }
    
    void compararSumas(int a){
        //Tenga en cuenta además que si hay dos recorridos que tienen el mismo número de insectos esperados, se tendrá en cuenta el siguiente criterio de preferencia: Preorder - Inorder - Postorder.
         
        sumaPreOrder(a);        
        sumaInOrder(a);
        sumaPostOrder(a);
        if((sumaPreOrder1>sumaInOrder1&&sumaPreOrder1>sumaPostOrder1)||(sumaPreOrder1==sumaInOrder1&&sumaPreOrder1>sumaPostOrder1)||(sumaPreOrder1>sumaInOrder1&&sumaPreOrder1==sumaPostOrder1)||(sumaPreOrder1==sumaInOrder1&&sumaPreOrder1==sumaPostOrder1)){
            System.out.print("Preorder "+sumaPreOrder1);
        }else if((sumaInOrder1>sumaPreOrder1&&sumaInOrder1>sumaPostOrder1)||(sumaInOrder1>sumaPreOrder1&&sumaInOrder1==sumaPostOrder1)){
            System.out.print("Inorder "+sumaInOrder1);
        }else if((sumaPostOrder1>sumaPreOrder1&&sumaPostOrder1>sumaInOrder1)||(sumaPostOrder1>sumaPreOrder1&&sumaPostOrder1==sumaInOrder1)){
            System.out.print("Postorder " + sumaPostOrder1);
        }
    }
}

public class entregaBST {
    public static void main(String[] args) {
        ArbolLevelOrder Arbol = new ArbolLevelOrder();
        Scanner scanner = new Scanner(System.in);      
        
        String[] entrada = scanner.nextLine().split(" ");
        int[] enteros = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            enteros[i] = Integer.parseInt(entrada[i]);
        }
        
        int a = scanner.nextInt();
        //int arr[] = { 4, 20, 10, -1, 16, 4, 0 };
        int n = enteros.length;
        Arbol.createTree(enteros, n);
          
        Arbol.compararSumas(a);
    }
}
