import java.util.*;
class singlelinkedlist
{
    class Node
    {
        int data;
        Node next;
        Node start1=null;
        Node start2=null;
        Node start3=null;
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
    int lengthoflist(Node start)
    {
        int count=0;
        while (start!=null)
        {
            count=count+1;
            start=start.next;
        }
        return count;
    }
    Node insertionatbeginning(Node start,int data)
    {
        Node temp=start;
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=start;
        start=newnode;
        return start;
    }
    Node addlist(Node start1,Node start2,Node start3)
    {
        int count1=lengthoflist(start1);
        int count2=lengthoflist(start2);
        int diff=0;
        if (count1>count2)
        {
            diff=count1-count2;
        }
        else 
        {
            diff=count2-count1;
        }
        int k=1;
        while (k<=diff)
        {
            if (count1>count2)
            {
                start2=insertionatbeginning(start2,0);
            }
            if (count1<count2)
            {
                start1=insertionatbeginning(start1,0);
            }
            k=k+1;
        }
      
        
        start1=reverse(start1);
        start2=reverse(start2);
        int add=0;
        int rem=0,div=0;
        int carry=0;
        while (start1!=null && start2!=null)
        {
            rem=((start1.data+start2.data)%10)+carry;
            carry=0;
            start3=create(start3,rem);
            carry=(start1.data+start2.data)/10;
            rem=0;
            start1=start1.next;
            start2=start2.next;
        }
        start3=reverse(start3);
        return start3;
    }
}
class addtwolist
{
    public static void main(String args[])
    {
        singlelinkedlist s1=new singlelinkedlist();
        singlelinkedlist.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int data,choice,ch=1;
        while (ch==1)
        {
            System.out.println("1.Exit\n2.Create in linked list 1\n3.Create in linked list 2\n4.Display for linked list 1\n5.Display for linked list 2\n6.Add two list");
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
                    nn.start1=s1.create(nn.start1,data);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the data");
                    data=myobj.nextInt();
                    nn.start2=s1.create(nn.start2,data);
                    break;
                }
                case 4:
                {
                    s1.display(nn.start1);
                    break;
                }
                case 5:
                {
                    s1.display(nn.start2);
                    break;
                }
                case 6:
                {
                    nn.start3=s1.addlist(nn.start1,nn.start2,nn.start3);
                    s1.display(nn.start3);
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