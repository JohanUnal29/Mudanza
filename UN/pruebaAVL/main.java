import java.util.Scanner;

//esta es una implementación base o normal, es más para tenerl ahí por si algo.

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

    void buscar(String elemento) {
        if (BuscaEnAVL(root, elemento)) {
            System.out.println("Existe");
        } else {
            System.out.println("No Existe");
        }
    }

    boolean BuscaEnAVL(NodoAVL nodoActual, String elemento) {
        if (nodoActual == null) {
            return false;
        } else if (elemento.equals(nodoActual.key)) {
            return true;
        } else if (elemento.compareTo(nodoActual.key) < 0) {
            return BuscaEnAVL(nodoActual.left, elemento);
        } else {
            return BuscaEnAVL(nodoActual.right, elemento);
        }
    }

    void eliminar(String key) {
        root = eliminarAVL(root, key);
    }

    NodoAVL eliminarAVL(NodoAVL nodoActual, String key) {
        if (nodoActual == null)
            return nodoActual;

        if (key.compareTo(nodoActual.key) < 0) {
            nodoActual.left = eliminarAVL(nodoActual.left, key);
        } else if (key.compareTo(nodoActual.key) > 0) {
            nodoActual.right = eliminarAVL(nodoActual.right, key);
        } else {
            if ((nodoActual.left == null) || (nodoActual.right == null)) {
                NodoAVL temp = null;
                if (temp == nodoActual.left) {
                    temp = nodoActual.right;
                } else {
                    temp = nodoActual.left;
                }

                if (temp == null) {
                    nodoActual = null;
                } else {
                    nodoActual = temp;
                }
            } else {
                NodoAVL temp = getNodoConValorMaximo(nodoActual.left);
                nodoActual.key = temp.key;
                nodoActual.left = eliminarAVL(nodoActual.left, temp.key);
            }
        }

        if (nodoActual == null)
            return nodoActual;

        nodoActual.altura = Math.max(getAltura(nodoActual.left), getAltura(nodoActual.right)) + 1;

        int fe = getFactorEquilibrio(nodoActual);

        if (fe > 1 && getFactorEquilibrio(nodoActual.left) >= 0) {
            return rightRotate(nodoActual);
        }

        if (fe < -1 && getFactorEquilibrio(nodoActual.right) <= 0) {
            return leftRotate(nodoActual);
        }

        if (fe > 1 && getFactorEquilibrio(nodoActual.left) < 0) {
            nodoActual.left = leftRotate(nodoActual.left);
            return rightRotate(nodoActual);
        }

        if (fe < -1 && getFactorEquilibrio(nodoActual.right) > 0) {
            nodoActual.right = rightRotate(nodoActual.right);
            return leftRotate(nodoActual);
        }

        return nodoActual;
    }

    NodoAVL rightRotate(NodoAVL nodoActual) {
        NodoAVL nuevaRaiz = nodoActual.left;
        NodoAVL temp = nuevaRaiz.right;

        // Se realiza la rotacion
        nuevaRaiz.right = nodoActual;
        nodoActual.left = temp;

        // Actualiza alturas
        nodoActual.altura = max(getAltura(nodoActual.left), getAltura(nodoActual.right)) + 1;
        nuevaRaiz.altura = max(getAltura(nuevaRaiz.left), getAltura(nuevaRaiz.right)) + 1;

        return nuevaRaiz;
    }

    NodoAVL leftRotate(NodoAVL nodoActual) {
        NodoAVL nuevaRaiz = nodoActual.right;
        NodoAVL temp = nuevaRaiz.left;

        // Se realiza la rotacion
        nuevaRaiz.left = nodoActual;
        nodoActual.right = temp;

        // Actualiza alturas
        nodoActual.altura = max(getAltura(nodoActual.left), getAltura(nodoActual.right)) + 1;
        nuevaRaiz.altura = max(getAltura(nuevaRaiz.left), getAltura(nuevaRaiz.right)) + 1;

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

    // Devuelve el mayor entre dos numeros
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Obtiene el factor de equilibrio de un nodo
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

}

public class main {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();

        System.out.println("ROTACION SIMPLE DERECHA - EJEMPLO 1");
        Scanner scanner = new Scanner(System.in);
        int n = 9;

        for (int i = 0; i < n; i++) {
            arbol.insertar(scanner.next());
        }
        arbol.mostrarArbolAVL();
    }
}
