//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;data:image/pjpeg;base64,/9j/4AAQSkZJRgABAQEAYABgAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCAA/AD8DASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEAAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+tCiiivPPz8KKKKACiiigAooooAKKKKACvKfib8dvgl8FY9Ll+MXxg+GHwpj1w3g0VviN488LeCzrB09IXvV0lPEeqac+pvapcQtcR2C3EkKyRmVUEke/1avkfxn+w7+yp8Rfi94n+PHxb+D/AIN+KnjvxBoWneG5rz4oafa+MvDeh+F9F0+xt7XTtG8H6/FdeELCRLi2vtTm1+fRrrxKs+p31umuR6S8OmWyfNb3UvO7aVuuqTM6nteX9z7Pnb3q83JFdZWhrJrteKs276Wf0L4C+I3w9+KnhyDxh8L/AB54L+JHhO5ubqyg8T+AvFOheMPD8t9YsqX1kmseHr/UdPa7sndUurcXBkgdgsig8V2dfz1/8EjtB8N2X7bX/BRfUf2YZIoP2J7bWvCHhzwygeW98Oax8S9PutRuJJ/hlrNoLrRrvwboTXHxDWwXT70zXHg7xL8LLm6STTn0uZP6FKUJOUbtW6aarTs7LQxwWIlisNCtOMYycpwfI24ScJyg5029XCXLePNaVmrq4UUUVR1BRRRQAf55r+aH/gpt+2L4f+J37XV3+wL8SPj/AKl+yp+y94H8P6Bq/wC0r450zRdb1Hxf8WpPEvh7QfFUfww8FT+E9F8Y3Q0nUvDXivQ7ZpPEWl6Noa3cfjLUPEmkeMrLRPCnhjxT/S9Xiniz9mr9nPx94g1DxZ46+APwU8a+KtXNsdW8TeLfhX4F8SeIdUNlZW+nWZ1HWtZ0G91K+a10+0tLG2a5uZTDZ2tvbRlYYYkWKkXOPKna71vfVdtGnr6nHjsPVxNFUqVSNO9SEqikpuNWlG7lSlyThJKbtdqWytbU+Uv2Fv2kP+CefiDTrD9mb9iDxj4bvLbwN4T1DxZ/whnh7wl8QtImt9Bs9V0XR9W8Ua5rnjXwzo8uvard6tr2iw6nq19qeqa/qd3fQz3bSxJNPB+i4ORn/PWvJvAvwC+BPwu1e48Q/DP4K/CX4da/d6dLo93rngT4c+D/AAjrF1pE93Y6hPpVzqfh/RtPvZ9Nmv8ATNNvprCWd7WW806xuXiae0t3j9apxTUUny6K3upqOnZNv89zbDwnTpRhU9leLslRg6dOMEoqMYxbk1azu7u97+SKKKKo2CiiigAooooAKKKKACiiigD/2Q==
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    public static Node reverse(Node head){
        if(head==null||head.next==null)
        return head;
        
      Node new_head = reverse(head.next);
      head.next.next = head;
      head.next = null;
      return new_head;
    }
    
    Node compute(Node head)
    {
        // your code here
        if(head==null||head.next == null){
            return head;
        }
        head = reverse(head);
        Node prev = head;
        Node curr = head.next;
        
        while(curr!=null){
           
            if(curr.data<prev.data){
                
                 prev.next = curr.next;
                 curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
    
        head = reverse(head);
        return head;
        
    }
}
  