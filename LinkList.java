import java.util.*;
public class LinkList {
    static class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
    }
    static node head=null,end=null;
    static void ins(int d){
        node n=new node(d);
        if(head==null)
        head=end=n;
        else{
            end.next=n;
            end=n;
        }
    }
    static void dis(){
        node temp=head;
        while2(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[]args){
        ins(12);
        ins(15);
        ins(23);
        dis();
    }
}
