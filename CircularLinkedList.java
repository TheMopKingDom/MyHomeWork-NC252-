// @5907101024 : Pacharapon Sreepiachai


import java.util.*;

public class CircularLinkedList {
	public int size =0;
    public Node head=null;
    public Node tail=null;
    //add a new node at the start of the linked list
    public void addNodeAtStart(int val){
        Node nptr = new Node(val,null);    
        nptr.setLink(head);
        if(head == null){            
        	head = nptr;
         nptr.setLink(head);
         tail = head;            
        }
        else{
        	tail.setLink(nptr);
            head = nptr;        
        }
        size++ ;
    }
//-------------------------------------------------------
    public void deleteAtPos(int pos){
        if (size == 1 && pos == 1){
            head = null;
            tail = null;
            size = 0;
           return ;
        }       
        if (pos == 1){
        	head = head.getLink();
            tail.setLink(head);
            size--; 
           return ;
        }
        
        if (pos == size){
           Node s = head;
           Node t = head;
            while (s != tail){
                t = s;
                s = s.getLink();
            }
            tail = t;
            tail.setLink(head);
            size --;
           return;
        }
        Node ptr = head;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++){ 
            if (i == pos){
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;  
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }
//-------------------------------------------------------
    //print the linked list
    public void print(){
        System.out.print("Circular Linked List:");
        Node temp = head;
        if(size<=0){
            System.out.print("List is empty");
        }else{
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
            while(temp!=head);
        }
        System.out.println();
    }
//-------------------------------------------------------
    //get Size
    public int getSize(){
        return size;
    }
//-------------------------------------------------------
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	CircularLinkedList list = new CircularLinkedList();
    	System.out.println("Enter number for create node!");
    		int node = input.nextInt();
    	System.out.println("Enter number for start delete at position ");
    		int multiple = input.nextInt();
    	for(int i =0;i<node;i++){
    		list.addNodeAtStart(i);
    	}
    	
    	for(int i =0;i<node;i++){
    		if(list.getSize()!=1){
    		list.deleteAtPos(multiple);
    		}
    		list.print();
    	}
    }
}
//-------------------------------------------------------
class Node{
    int data;
    Node next ;
		public Node(){
			next = null;
		data = 0;
		}
//-------------------------------------------------------
		public Node(int data,Node next){
		this.data = data;
		this.next=next;
		}
//-------------------------------------------------------
		public void setLink(Node next){
	        this.next = next;
	    }
//-------------------------------------------------------		
	    public void setData(int data){
	        this.data = data;
	    }
//-------------------------------------------------------	   
	    public Node getLink(){
	        return next;
	    }
//-------------------------------------------------------
	    public int getData(){
	        return data;
//-------------------------------------------------------
}
}

//	 linked list singly not doubly or circular get problem in loop
//  some of code get form GitHub and StackOverflow , Mukya
// get code form Sirawit
