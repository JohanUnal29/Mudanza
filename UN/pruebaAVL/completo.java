//es el mismo ejercicio que "entrega.java" solo que quise especificar más acá.

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

    void mostrarArbolAVL() {
        System.out.println("Arbol AVL");
        showTree(root, 0);
    }

    void showTree(NodoAVL nodo, int depth) {
        if (nodo.right != null) {
            showTree(nodo.right, depth + 1);
        }
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println("(" + nodo.key + ")");

        if (nodo.left != null) {
            showTree(nodo.left, depth + 1);
        }
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

public class completo {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();

        System.out.println("ROTACION SIMPLE DERECHA - EJEMPLO 1");
        Scanner scanner = new Scanner(System.in);
        int n = 9;

        for (int i = 0; i < n; i++) {
            arbol.insertar(scanner.next());
        }
        arbol.mostrarArbolAVL();

        System.out.println("Ingrese el punto de partida y el punto de llegada separados por un espacio:");
        String inicio = scanner.next();
        String fin = scanner.next();

        int numeroLugares = arbol.obtenerNumeroLugaresEntre(inicio, fin);

        if (numeroLugares != -1) {
            System.out.println("El número mínimo de lugares a visitar entre " + inicio + " y " + fin + " es: " + numeroLugares);
        } else {
            System.out.println("Alguno de los lugares ingresados no existe en el árbol.");
        }
    }
}

