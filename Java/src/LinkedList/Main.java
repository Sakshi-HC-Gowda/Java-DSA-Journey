package LinkedList;


class SLL {
    Node head;
    Node tail;

    public void insert(int data) {
        Node hello = new Node(data);

        if (head == null) {
            head = hello;
            tail = hello;
        } else {
            tail.next = hello;
            tail = hello;
        }
    }

    public void dis() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println();
    }

    public void search(int val) {
        Node n = head;
        while (n != null) {
            if (n.data == val) {
                System.out.println("Value is found");
                return;
            }
            n = n.next;
        }
        System.out.println("Value is not found");
    }

    public void delete(int val) {
        // delete first node
        if (head != null && head.data == val) {
            head = head.next;
            return;
        }

        Node n = head;

        // traverse until the node before the target
        while (n != null && n.next != null && n.next.data != val) {
            n = n.next;
        }

        // if element found
        if (n != null && n.next != null) {
            n.next = n.next.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SLL o = new SLL();
        o.insert(10);
        o.insert(20);
        o.insert(30);
        o.insert(40);

        o.dis();
        o.search(100);

        o.delete(40);
        o.dis();
    }
}
