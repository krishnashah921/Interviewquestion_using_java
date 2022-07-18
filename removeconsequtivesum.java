//input  1-2-3--3-1-NULL
//output:-1-2-1-Null
import java.util.*;
class singlelinkedlist
{
    class Node
    {
        int data;
        Node next;
        Node start=null;
    }
    Node create(Node start,int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if (start==null)
        {
            start=newnode;
            return start;
        }
        else 
        {
            Node temp=start;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            return start;
        }
    }
    void display(Node start)
    {
        if (start==null)
        {
            System.out.println("no data");
        }
        else
        {
            Node temp=start;
            while (temp!=null)
            {
            System.out.println(temp.data);
            temp=temp.next;
            }
        }
    }
    Node removesumzero(Node start)
    {
     Map<Integer,Node> map=new HashMap<Integer,Node>();  
     Node dummy=new Node();
     //final  hm=new Map();
     dummy.data=0;
     dummy.next=start;
     map.put(0,dummy);
     int prefixsum=0;
     Node temp=start;
     while (start!=null)
     {
         prefixsum=prefixsum+start.data;
         if (map.containsKey(prefixsum))
         {
             start= map.get(prefixsum).next;
             int sum = prefixsum + start.data;
             while (sum != prefixsum) {
            map.remove(sum);
            start=start.next;
            sum += start.data;
          }
          map.get(prefixsum).next = start.next;
         }
         else 
         {
             map.put(prefixsum, start);
         }
         start=start.next;
     }
     return dummy.next;
    }
}
class removeconsequtivesum
{
    public static void main(String args[])
    {
        singlelinkedlist s1=new singlelinkedlist();
        singlelinkedlist.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int data,choice,ch=1;
        while (ch==1)
        {
            System.out.println("1.Exit\n2.Create\n3.Display\n4.Remove duplicate sum of consenqutive");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    ch=0;
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the data");
                    data=myobj.nextInt();
                    nn.start=s1.create(nn.start,data);
                    break;
                }
                case 3:
                {
                    s1.display(nn.start);
                    break;
                }
                case 4:
                {
                    nn.start=s1.removesumzero(nn.start);
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }
        
    }
}