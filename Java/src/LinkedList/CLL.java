package LinkedList;
class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
	}
public class CLL {

	public static void main(String[] args) {
		Node head=new Node(1);
		Node sec=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node tail=new Node(5);
		head.next=sec;
		sec.next=third;
		third.next=fourth;
		fourth.next=tail;
		tail.next=head;
		dis(head);
	}
	public static void dis(Node head) {
		Node n=head;
	do { 
		System.out.print(n.data+"->");
	n=n.next;
	}while(n!=head);

	}
}
