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
    void getnthnode(Node start,int num)
    {
        Node slow,fast;
        slow=start;
        fast=start;
        int count=1;
        while (fast!=null && count<=num-1)
        {
            fast=fast.next;
            count=count+1;
            
        }
        Node temp=null;
        while (fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data);
        
    }
}
class getnthnode
{
    public static void main(String args[])
    {
        singlelinkedlist s1=new singlelinkedlist();
        singlelinkedlist.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int data,choice,ch=1;
        while (ch==1)
        {
            System.out.println("1.Exit\n2.Create\n3.Display\n4.get nth node");
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
                    System.out.println("enter the position from end to get the node");
                    int num=myobj.nextInt();
                    s1.getnthnode(nn.start,num);
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