package LinkedList;

class NodeC{
    int data;
    NodeC next;
    NodeC prev;
    
    NodeC(int data)
    {
        this.data=data;
    }}
    class CircularLinkedList
    {
        NodeC head;
        NodeC tail;
   
    CircularLinkedList()
{
head=tail=null;   
} 
    public void add(int data)
    {
        NodeC hello=new NodeC(data);
        if(head==null)
        {
            head=hello;
            tail=hello;
            tail.next=head;
            head.prev=tail;
        }
        else
        {
            tail.next=hello;
            hello.prev=tail;
            tail=hello;
             tail.next=head;
            head.prev=tail;
         }
    }
    public void del(int tar)
    {
       if(head.data==tar) {
        head=head.next;
        head.prev=tail;
       }
       else if(tail.data==tar)
       {
           tail=tail.prev;
           tail.next=head;
       }
       else
       {
           NodeC n=head;
           while(n.next.data!=tar)
           {
               n=n.next;
               
           }
           n.next=n.next.next;
           n.next.prev=n;
       }
    }
    public void dis1()
    {
        NodeC n= head;
        do{
        System.out.print(n.data+"->");
    n=n.next;
        }
    while(n!=head);
    System.out.println();
        }
    
      public void dis2()
    {
        NodeC n=tail;
    do{
        System.out.print(n.data+"->");
    n=n.prev;}
    while(n!=tail);

        }
    }
    

public class DoublyCircular {
    public static void main(String[] args){
    	CircularLinkedList l = new CircularLinkedList();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
     l.del(40);
     l.dis1();
      System.out.println();
      l.dis2();
      System.out.println();
}}