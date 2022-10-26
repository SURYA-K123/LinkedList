class LinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            Node next=null;
        }
    }
    void append(LinkedList list,int data)
    {
        Node s=list.head;
        Node a=new Node(data);
        if (list.head==null)
        {
            list.head=a;
            return;
        }
        while (s.next!=null)
        {
            s=s.next;
        }
        s.next=a;
    }
    void delete(LinkedList list,int val)
    {
        Node a=list.head;
        if (head==null)
        {
            System.out.println("The list is empty nothing to delete");
            return;
        }
        if(list.head.data==val)
        {
            list.head=list.head.next;
            return;
        }
        else {
            Node prev = new Node(0);
            while (a.next != null && a.data != val) {
                prev = a;
                a = a.next;
            }
            if (a.data == val) {
                prev.next = a.next;
                return;
            }
            System.out.println(val+" not found");
        }

    }
    void insertafter(LinkedList list,int data1,int data2)
    {
        Node s= new Node(data2);
        Node h=list.head;
        while(h.data!=data1 && h.next!=null)
        {
            h=h.next;
        }
        if(h.next==null && h.data!=data1)
        {
            return;
        }
        s.next=h.next;
        h.next=s;
    }
    void push(LinkedList list,int d)
    {
        Node n=new Node(d);
        if (list.head == null)
        {
            list.head = n;
        }
        else
        {
            n.next=list.head;
            list.head=n;
        }
    }
    void print(LinkedList list)
    {
        Node s=list.head;
        while(s!=null)
        {
            System.out.print(s.data+" ");
            s=s.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.push(list,3);
        list.push(list,5);
        list.push(list,7);
        list.insertafter(list,3,10);
        list.append(list,70);
        list.delete(list,9);
        list.delete(list,10);
        list.print(list);
    }
}
