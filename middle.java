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
    void middleelement(Node start)
    {
        Node slow,fast ;
        slow=start;
        fast=start;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}
class middle
{
    public static void main(String args[])
    {
        singlelinkedlist s1=new singlelinkedlist();
        singlelinkedlist.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int data,choice,ch=1;
        while (ch==1)
        {
            System.out.println("1.Exit\n2.Create\n3.Display\n4.middle element");
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
                    s1.middleelement(nn.start);
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