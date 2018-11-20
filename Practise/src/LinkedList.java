class Node{
  int val;
  Node next;
  Node (int n1){
    this.val=n1;
  }
}
public class LinkedList {
	
	static Node head;
	  
	  void insertion(int n1){
		  Node temp=head;
	    Node n= new Node(n1);
	    if(head==null){
	      head=n;    
	    }else {
	      
	      while(temp.next!=null){
	        temp=temp.next;
	      }
	      temp.next=n;
	    }
	  }
	  //remove last element from linked list
	  void remove() {
		  Node temp=head;
		  while(temp.next.next!=null) {
			  temp=temp.next;
		  }
		  temp.next=null;
	  }
	  void length() {
		Node temp=head;
		int len = 1;
		while(temp.next!=null) {
			temp=temp.next;
			len++;
		}
		System.out.println(len);
		
		  
	  }
	  void print(Node head){
	      Node temp=head;
	      System.out.println("the head is "+head.val);
	      while(temp!=null){
	        System.out.print(temp.val+"-->");
	        temp=temp.next;
	       // System.out.println(temp.val+"-->");
	      }
	      System.out.println();
	    }
	    
	  
	  public static void main(String[] args){
	    LinkedList l= new LinkedList();
	    l.insertion(1);
	    l.insertion(2);
	    l.insertion(4);
	    l.insertion(3);
	    l.insertion(10);
	    l.insertion(12);
	    l.insertion(23);
	    l.insertion(34);
	    l.insertion(45);
	    System.out.println("i am done insertion");
	    l.print(head);
	    //l.remove();
	    //l.print(head);
	    l.length();
	    
	  }

}
