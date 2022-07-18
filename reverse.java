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
        Node temp=start;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    Node reverse(Node start)
    {
        Node prev=null,nexxt,current=start;
        while(current!=null)
        {
            nexxt=current.next;
            current.next=prev;
            prev=current;
            current=nexxt;
        }
        start=prev;
        return start;
    }
}
class reverse
{
    public static void main(String args[])
    {
        singlelinkedlist sl=new singlelinkedlist();
        singlelinkedlist.Node nn=sl.new Node();
        Scanner myobj=new Scanner(System.in);
        int choice ,ch=1,data;
        while (ch==1)
        {
            System.out.println("1.Exit\n2.Create\n3.Display\n4.Reverse the linked list");
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
                    nn.start=sl.create(nn.start,data);
                    break;
                }
                case  3:
                {
                    sl.display(nn.start);
                    break;
                }
                case 4:
                {
                    nn.start=sl.reverse(nn.start);
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
