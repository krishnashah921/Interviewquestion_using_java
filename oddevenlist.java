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
    Node oddeven(Node start)
    {
        Node odd,even,oddhead,evenhead;
        odd=start;
        oddhead=start;
        even=start.next;
        evenhead=start.next;
        while (even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return oddhead;//return start....any of this will work
    }
}
class oddevenlist
{
    public static void main(String args[])
    {
        singlelinkedlist s1=new singlelinkedlist();
        singlelinkedlist.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int data,choice,ch=1;
        while (ch==1)
        {
            System.out.println("1.Exit\n2.Create\n3.Display\n4.Odd even list");
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
                    nn.start=s1.oddeven(nn.start);
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