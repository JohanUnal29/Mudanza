
// Viaje
// ## Enunciado del problema

// Carlos, un estudiante de ingeniería de sistemas, está pensando en viajar en vacaciones para cuando acabe este semestre en julio. Para eso pregunta a su amiga Mariana, que es una reconocida guía turística de la región, y ella le recomienda viajar por diferentes pueblitos de Boyacá. A Carlos le gustó la idea y le pidió que escribiera en una lista de diferentes lugares que debería visitar. Mariana escribió la siguiente lista:

// {"Mongui", "Sachica", "Tinjaca", "Combita", "Chiquiza", "Sutamarchan", "Tibasosa", "Toca", "Guican", "Chivata", "Topaga", "Soraca", "Gameza", "Guayata", "Raquira", "Nobsa", "Tenza", "Aquitania"}

// Pero Carlos, que se apasiona de aplicar lo que aprende en Estructuras de Datos en su vida cotidiana, decide que va a agregar uno a uno y en orden los lugares que escribió Mariana en la lista anterior en un árbol AVL. Los nombres se agregan por orden lexicográfico.

// Una vez que Carlos crea el árbol AVL, se pregunta cuál será el menor número de lugares que debe visitar entre dos lugares organizados en el árbol (se tienen en cuenta los lugares de inicio y fin del recorrido).

// Por ejemplo: https://drive.google.com/file/d/1cSQc0GGyFzHmbu8WeQNJvdrwygNfUjm1/view?usp=share_link En la imagen anterior, se creó un árbol AVL con las letras en el rango [a..i]. Para ir del nodo 'c' al nodo 'e' se debe seguir la ruta c->b->d->f->e dando un total de 5 nodos.

// # Entrada

// Dos puntos de partida y llegada diferentes, separados por espacios.

// Salida

// ---

// Número mínimo de lugares que debe visitar en el recorrido por el árbol AVL (Recuerde que en esta cuenta se cuentan los puntos de salida y llegada)

// ## Ejemplos

// Entrada Ejemplo 1

// Tinjaca Guican
// Salida Ejemplo 1

// 6

// Entrada Ejemplo 2

// Tenza Chivata
// Salida Ejemplo 2

// 7

// ## Notas

// La salida no debe tener un caracter de nueva línea al final del archivo, de lo contrario puede recibir el veredicto de respuesta incorrecta.

import java.util.Scanner;

class NodoAVL {
    NodoAVL left;
    NodoAVL right;
    String key;
    int altura;

    NodoAVL(String d) {
        key = d;
        altura = 1;
    }
}

class ArbolAVL {
    NodoAVL root;

    void clearAll() {
        root = null;
    }

    void insertar(String key) {
        root = insertarAVL(root, key);
    }

    NodoAVL insertarAVL(NodoAVL nodoActual, String key) {
        if (nodoActual == null) {
            return (new NodoAVL(key));
        }

        if (key.compareTo(nodoActual.key) < 0) {
            nodoActual.left = insertarAVL(nodoActual.left, key);
        } else if (key.compareTo(nodoActual.key) > 0) {
            nodoActual.right = insertarAVL(nodoActual.right, key);
        } else {
            return nodoActual;
        }

        nodoActual.altura = 1 + Math.max(getAltura(nodoActual.left), getAltura(nodoActual.right));

        int fe = getFactorEquilibrio(nodoActual);

        if (fe > 1 && key.compareTo(nodoActual.left.key) < 0) {
            return rightRotate(nodoActual);
        }

        if (fe < -1 && key.compareTo(nodoActual.right.key) > 0) {
            return leftRotate(nodoActual);
        }

        if (fe > 1 && key.compareTo(nodoActual.left.key) > 0) {
            nodoActual.left = leftRotate(nodoActual.left);
            return rightRotate(nodoActual);
        }

        if (fe < -1 && key.compareTo(nodoActual.right.key) < 0) {
            nodoActual.right = rightRotate(nodoActual.right);
            return leftRotate(nodoActual);
        }

        return nodoActual;
    }

    NodoAVL rightRotate(NodoAVL nodoActual) {
        NodoAVL nuevaRaiz = nodoActual.left;
        NodoAVL temp = nuevaRaiz.right;

        // Realiza la rotacion
        nuevaRaiz.right = nodoActual;
        nodoActual.left = temp;

        // Actualiza alturas
        nodoActual.altura = Math.max(getAltura(nodoActual.left), getAltura(nodoActual.right)) + 1;
        nuevaRaiz.altura = Math.max(getAltura(nuevaRaiz.left), getAltura(nuevaRaiz.right)) + 1;

        return nuevaRaiz;
    }

    NodoAVL leftRotate(NodoAVL nodoActual) {
        NodoAVL nuevaRaiz = nodoActual.right;
        NodoAVL temp = nuevaRaiz.left;

        // Realiza la rotacion
        nuevaRaiz.left = nodoActual;
        nodoActual.right = temp;

        // Actualiza alturas
        nodoActual.altura = Math.max(getAltura(nodoActual.left), getAltura(nodoActual.right)) + 1;
        nuevaRaiz.altura = Math.max(getAltura(nuevaRaiz.left), getAltura(nuevaRaiz.right)) + 1;

        return nuevaRaiz;
    }

    int getAltura(NodoAVL nodoActual) {
        if (nodoActual == null) {
            return 0;
        }

        return nodoActual.altura;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int getFactorEquilibrio(NodoAVL nodoActual) {
        if (nodoActual == null) {
            return 0;
        }

        return getAltura(nodoActual.left) - getAltura(nodoActual.right);
    }

    NodoAVL getNodoConValorMaximo(NodoAVL node) {
        NodoAVL current = node;

        while (current.right != null) {
            current = current.right;
        }

        return current;
    }

    int obtenerNumeroLugaresEntre(String inicio, String fin) {
        NodoAVL nodoInicio = buscarNodo(root, inicio); //buscar si existe
        NodoAVL nodoFin = buscarNodo(root, fin); //buscar si existe

        if (nodoInicio == null || nodoFin == null) {
            return -1; // Alguno de los nodos no existe en el árbol
        }

        int distancia = obtenerDistanciaEntreNodos(root, nodoInicio, nodoFin);

        return distancia != -1 ? distancia + 1 : -1;
    }

    NodoAVL buscarNodo(NodoAVL nodoActual, String key) {
        if (nodoActual == null) {
            return null;
        } else if (key.equals(nodoActual.key)) {
            return nodoActual;
        } else if (key.compareTo(nodoActual.key) < 0) {
            return buscarNodo(nodoActual.left, key);
        } else {
            return buscarNodo(nodoActual.right, key);
        }
    }

    int obtenerDistanciaEntreNodos(NodoAVL nodoActual, NodoAVL nodoInicio, NodoAVL nodoFin) {
        if (nodoActual == null) {
            return -1;
        }

        if (nodoActual.key.compareTo(nodoInicio.key) > 0 && nodoActual.key.compareTo(nodoFin.key) > 0) {
            return obtenerDistanciaEntreNodos(nodoActual.left, nodoInicio, nodoFin);
        }

        if (nodoActual.key.compareTo(nodoInicio.key) < 0 && nodoActual.key.compareTo(nodoFin.key) < 0) {
            return obtenerDistanciaEntreNodos(nodoActual.right, nodoInicio, nodoFin);
        }

        int distanciaDesdeInicio = obtenerDistanciaDesdeNodo(nodoActual, nodoInicio);
        int distanciaDesdeFin = obtenerDistanciaDesdeNodo(nodoActual, nodoFin);

        if (distanciaDesdeInicio != -1 && distanciaDesdeFin != -1) {
            return distanciaDesdeInicio + distanciaDesdeFin;
        }

        return -1;
    }

    int obtenerDistanciaDesdeNodo(NodoAVL nodoActual, NodoAVL nodo) {
        if (nodoActual == null) {
            return -1;
        }

        if (nodoActual.key.equals(nodo.key)) {
            return 0;
        }

        int distanciaIzquierda = obtenerDistanciaDesdeNodo(nodoActual.left, nodo);
        int distanciaDerecha = obtenerDistanciaDesdeNodo(nodoActual.right, nodo);

        if (distanciaIzquierda == -1 && distanciaDerecha == -1) {
            return -1;
        }

        return (distanciaIzquierda != -1) ? distanciaIzquierda + 1 : distanciaDerecha + 1;
    }
}

public class entrega{
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();

        Scanner scanner = new Scanner(System.in);
       //{"Mongui", "Sachica", "Tinjaca", "Combita", "Chiquiza", "Sutamarchan", "Tibasosa", "Toca"
       //, "Guican", "Chivata", "Topaga", "Soraca", "Gameza", "Guayata", "Raquira", "Nobsa", "Tenza", "Aquitania"}
        
        arbol.insertar("Mongui");
        arbol.insertar("Sachica"); 
        arbol.insertar("Tinjaca"); 
        arbol.insertar("Combita"); 
        arbol.insertar("Chiquiza"); 
        arbol.insertar("Sutamarchan"); 
        arbol.insertar("Tibasosa");
        arbol.insertar("Toca"); 
        arbol.insertar("Guican"); 
        arbol.insertar("Chivata"); 
        arbol.insertar("Topaga"); 
        arbol.insertar("Soraca"); 
        arbol.insertar("Gameza");  
        arbol.insertar("Guayata"); 
        arbol.insertar("Raquira"); 
        arbol.insertar("Nobsa"); 
        arbol.insertar("Tenza"); 
        arbol.insertar("Aquitania");     

        String inicio = scanner.next();
        String fin = scanner.next();

        int numeroLugares = arbol.obtenerNumeroLugaresEntre(inicio, fin);

        System.out.println(numeroLugares);
        
    }
}
