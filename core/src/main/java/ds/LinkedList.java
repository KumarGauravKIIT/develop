package ds;

public class LinkedList {

    Node head;

   class Node{
       int data;
       Node next;

       public Node(int data) {
           data = data;
           next = null;
       }
   }

   public void push(int num){
       Node new_node = new Node(num);

       new_node.next = head;
       head = new_node;
   }
}
