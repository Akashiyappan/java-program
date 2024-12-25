public class LinkedListMain {
    public static void main(String [] args)throws Exception {
        LinkedList li=new LinkedList();
        li.insert(2);
        li.insert(5);
        li.insert(4);
        li.insert(6);
        li.display();
        li.delete(5);
        li.display();
    }
}
class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insert(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete(int d){
        Node temp=head;
        while(d!=temp.data){
            temp=temp.next;
        }
    }
}

