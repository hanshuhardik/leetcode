import java.util.*;
public class LL {
    Node head;
    class Node{
            String data;
            Node next;
            Node(String data1){
                this.data=data1;
                this.next=null;
            }
    }
    public void addFirst(String d) {
        Node newNode=new Node(d);
       newNode.next=head;
       head=newNode;

    }
    public void addLast(String d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node LN=head;
        while(LN.next!=null){
LN=LN.next;
        }
        LN.next=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.print("empty list");
        }


        head=head.next;

    }
    public void removeLast(){
        if(head==null){
            System.out.println("emopty list");return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node CurNode=head;
        Node LasNode=CurNode.next;
        while(LasNode.next!=null){
            CurNode=CurNode.next;
            LasNode=LasNode.next;

        }
        CurNode.next=null;

    }

    public void print(){
        Node p=head;
        while(p!=null){
            System.out.print(p.data+"->");
            p=p.next;
        }
    }
    public static void main(String args[]){
     LL list=new LL();
        list.addFirst("hanshu");
        list.addFirst("hardik");
        list.addLast("Mehta");list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
    }

}
