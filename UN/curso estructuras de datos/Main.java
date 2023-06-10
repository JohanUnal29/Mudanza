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
        levelOrder(root);
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

    static int zigzagTraversal(Node root) {
        if (root == null)
            return 0;

        int sum = 0;
        Queue<Node> queue = new LinkedList<>();
        boolean skip = false;
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (!skip) {
                    sum += node.key;
                } else {
                    skip = false;
                }

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            skip = true;
        }

        return sum;
    }

}

public class Main {
    public static void main(String[] args) {
        ArbolLevelOrder Arbol = new ArbolLevelOrder();
        Scanner scanner = new Scanner(System.in);

        String[] entrada = scanner.nextLine().split(" ");
        int[] enteros = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            enteros[i] = Integer.parseInt(entrada[i]);
        }

        int a = scanner.nextInt(); // minimo para sobrevivir

        int n = enteros.length;// tamaño arbol
        Arbol.createTree(enteros, n);

    }
}