public class linkedlist
{
    Node head=null;
    class Node
    {
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}
    void add(int data)
    {
    Node o=new Node(data);
    o.next=null;
    if (head==null)
    {
    head=o;
    return;
    }
    Node last=head;
    while(last.next!=null)
    {
    last=last.next;
    }
    last.next=o;
    }
    
 void print()
 {
Node t=head;
while(t!=null)
{
System.out.print(t.data+" ");
t=t.next;
}
 }
    
    public static void main(String g[])
    {
linkedlist obj=new linkedlist();
obj.add(1);
obj.add(2);
obj.add(3);
obj.add(4);
obj.add(5);
obj.print();
}
}