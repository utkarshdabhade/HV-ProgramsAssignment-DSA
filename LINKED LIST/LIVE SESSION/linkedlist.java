class Node{
    public Object Value;
    public Node next;  // Creating a Structure of node

}

class LinkedList {
    int size;
    Node head;

public void lList() {
    this.size = 0;
    this.head = null;
}

public void insertNode(int item){
    Node n1 = new Node();
    n1.Value = item;

    Node currentNode = this.head;
    if (this.head == null) {                     // inserting at the head
        this.head = n1;
        this.head.next = null; //Because no other nodes are available.
        this.size = 1; //Size is increased by 1 since 1 node is inserted.
    } else {
        while (currentNode != null)                 // inserting at the tail
        {
            currentNode = currentNode.next;
        }
        currentNode = n1;
        n1.next = null;
        this.size += 1;

    }
}
    public void insertMiddleNode(int item, int position){
        Node n1 = new Node();
        n1.Value = item;
    
        Node currentNode = this.head;
        
        if(this.head != null && position <= this.size){
        for (int i = 1; i < position ; i++)
        {
            currentNode = currentNode.next;   
        }  
            n1.next = currentNode.next;
            currentNode.next = n1;
            this.size += 1;  
        }  

    }

    public void insertNode (int item, int position){
        Node n1 = new Node();
        n1.Value = item;
    
        Node currentNode = this.head;
        
        if(this.head != null && position <= this.size){
        for (int i = 1; i < position ; i++)
        {
            currentNode = currentNode.next;   
        }  
            n1.next = head.next;
            head.next = n1;
            this.size += 1;  
    }

}   

public void deletelastNode(){
    if(this.head != null) {
    
    
        if(this.head.next == null) {
          this.head = null;
        } else {
          
          
         
          Node currentNode = new Node();
          currentNode = this.head;
          while(currentNode.next.next != null)
            currentNode = currentNode.next;
          
         
          currentNode.next = null;
        }
      }
     
        



    }







public class linkedlist{
public static void main(String[] args) {
    
}
}
}
