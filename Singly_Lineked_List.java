import java.util.*;
public class Singly_Lineked_List
{
    static class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
    }
    static node head=null,end=null;
    static void create(int d){
        node n=new node(d);
        if(head==null)
        head=end=n;
        else{
            end.next=n;
            end=n;
        }
    }
    static void display(node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static void insert(int p,int d){
        node n=new node(d);
        if(p==1){
            n.next=head;
            head=n;
        }
        else{
            node temp=head;
            for(int i=2;i<p;i++){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }
    static void delete(int d){
        node temp=head;
        if(d==temp.data){
            head=head.next;
        }
        else{
            node pre=null;
            while(temp.data!=d){
                pre=temp;
                temp=temp.next;
            }
            pre.next=temp.next;
        }
    }
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int size=x.nextInt();
	while(size--!=0){
	    int a=x.nextInt();
	    create(a);
	}
	int ch=1;
	while(ch!=4){
	    System.out.println("1-->insert   2-->delete  3-->display  4-->exit");
	    ch=x.nextInt();
	    switch(ch){
	        case 1:
	            System.out.println("enter position and value");
	            int p=x.nextInt();
	            int d=x.nextInt();
	            insert(p,d);
	            break;
	       case 2:
	           System.out.println("enter the value");
	           int v=x.nextInt();
	           delete(v);
	           break;
	       case 3:
	           System.out.println("elements are");
	           display(head);
	           break;
	    }
	}
	}
}