//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


class MergeLists
{
    Node head;



  /* Function to print linked list */
   public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
			Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }
			
			LinkedList obj = new LinkedList();
			Node head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
         }
    }
}

// } Driver Code Ends


/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     ArrayList<Integer> list = new ArrayList<>(); 
    //  Node curr1 = head1; 
    //  Node curr2 = head2;
    //  Node prev= null;
     
    //  while(curr1!=null && curr2!=null){
    //      if(head1.data>= curr2.data){
    //          head2 = head2.next;
    //          curr2.next = head1;
    //          head1 = curr2;
    //          curr2 = head2;
    //          curr1 = head1;
    //      }
    //      else{
    //         //  prev = curr1;
    //         //  curr1 = curr1.next;
    //          if(curr1.data>=curr2.data&&curr1!=null && curr2!=null){
    //              head2 = head2.next;
    //              curr2.next = curr1;
    //              prev.next = curr2;
    //              curr1 = curr2;
    //              curr2= head2;
    //          }
    //          prev = curr1;
    //          curr1 = curr1.next;
    //      }
    //  }
     
    //  return head1;
    
    while(head1!=null){
        list.add(head1.data);
        head1 = head1.next;
    }
     while(head2!=null){
        list.add(head2.data);
        head2 = head2.next;
    }
    
    Collections.sort(list);
    head1 = new Node(list.get(0));
    Node curr = head1;
    int i = 1;
    while(i<list.size()){
        curr.next= new Node(list.get(i));
        curr = curr.next;
        i++;
    }
    return head1;
   } 
}