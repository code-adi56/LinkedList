
import java.util.Scanner;
public class LinkedList {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next= null;
        }
    }

    public void push(int new_data){
 Node new_Node = new Node (new_data);
 new_Node.next = head;
 head= new_Node;

    }

    int count(int search_for)
    {
        Node current = head;
        int count = 0 ;
        while(current != null)
        {
            if(current.data == search_for)
            {
                count++;
            }
            current=current.next;
        }
        return count;
    }
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
      
        try (Scanner sc = new Scanner(System.in)) {
            int x= sc.nextInt();
            for (int i=0;i<x;i++)
            {
             int t= sc.nextInt();
             list.push(t);
            }
            int c= sc.nextInt();
            System.out.println("Count"+list.count(c));
        }
    }
}
