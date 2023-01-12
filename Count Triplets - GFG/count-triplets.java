//{ Driver Code Starts
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

class LinkedList{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            Node head=null;
            for(int i=0;i<n;i++)
            {int a=sc.nextInt();
            if(head==null){
                head=new Node(a);
            }
            else
                insert(head,a);
            }
        
            Solve y = new Solve();
            System.out.println(y.countTriplets(head,x));
        }
    }
    public static Node insert(Node head,int a){
        if(head==null){
            return new Node(a);
        }
        head.next=insert(head.next,a);
        return head;
    }
    
}


// } Driver Code Ends


//User function Template for Java

class Solve
{
    static int countTriplets(Node head, int x) 
    { 
        //code here.
        
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.data);
            head = head.next;
        }
        Collections.sort(list);
       // int i = 0;
       
        int count = 0;
        for(int i = 0;i<list.size()-2;i++){
             int j = i+1;
        int k = list.size()-1;
            while(j<k){
                if(list.get(i)+list.get(j)+list.get(k)==x){
                    count++;
                    j++;
                    k--;
                }
                else if(list.get(i)+list.get(j)+list.get(k)>x){
                    k--;
                }
                else{
                    j++;
                }

            }
            
        }
       if(list.size()<3)
        return 0;
        return count;
    } 
}