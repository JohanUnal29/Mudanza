package Talleres.Taller1.puntoOrdenExpo;
import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insert(String data) {
    Node node = new Node(data);
    if (head == null) {
        head = node;
    } else {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
   }


    void printList() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data);
          if (temp.next != null) {
              System.out.print(" ");
          }
          temp = temp.next;
        }
    }


    void reorganize() {
        
        //verificamos si esta vacía o solo tiene
        //un elemento
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow identifica el medio del array
        //fast identifica el final
        Node head1 = head;
        Node head2 = slow.next;
        slow.next = null;

        head2 = reverse(head2);

        head = new Node("");
        Node curr = head;
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                curr.next = head1;
                curr = curr.next;
                head1 = head1.next;
            }

            if (head2 != null) {
                curr.next = head2;
                curr = curr.next;
                head2 = head2.next;
            }
        }
        head = head.next;
    }

    Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node prev = null;
        Node curr = node;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

public class ordenExposicionesLinked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (scanner.hasNext()) {
            list.insert(scanner.next());
        }
        list.reorganize();
        list.printList();
    }
}
