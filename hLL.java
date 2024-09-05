import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class hLL {
    Node head;
     static class Node {
         int data;
         Node next;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }
         public  void firstAdd(int d){
             Node nn=new Node(d);
             if(head==null){
                 head=nn;
             }
             nn.next=head;
             head=nn;
         }
         public void lastAdd(int data){
         Node NN=new Node(data);
         if(head==null){
                head=NN;
                return;
            }
         Node cn=head;
         while(cn.next!=null){
             cn=cn.next;
         }
         cn.next=NN;
         }
         public void deleteFirst(){
         if(head!=null){
             head=head.next;
         }
         else{
             System.out.println("empty list");
         }}
         public void deleteLast(){
             if(head==null){
                 System.out.println("empty list");
                 return;
             }

             if(head.next==null){
                 head=null;
                 return;
             }
             Node ln=head;
             Node cn=ln.next;
             while(cn!=null){
                 cn=cn.next;
                 ln=ln.next;
             }
             ln=null;

             }
             public static void print(Node head){
                Node cn=head;
                while(cn!=null){
                    System.out.print(cn.data+"->");
                    cn=cn.next;
                }
             }
             public static boolean find(Node head){
                Stack<Integer> stack=new Stack<>();
                Node n=head;
                while(n!=null){
                    stack.push(n.data);
                    n=n.next;
                }
                System.out.println(stack);
                return false;
             }
    public static Node removeNthFromEnd(Node head, int n) {
        Node cur=head,temp=head;
        while(cur.next!=null && temp!=null){
            if(temp.next==null){
                System.out.println("null"+temp.data);
                if(cur.next==null){
                    head=null;
                    return head;
                }else{
                    cur.next=cur.next.next;
                    return head;
                }

            }else{
                for(int i=0;i<n;i++){
                    temp=temp.next;
                }
                cur=cur.next;
            }
        }
        return head;
    }
    public static Node segregate(Node head) {
        // add your code here
        Node first=new Node(-1),fN=first;
        Node second=new Node(-1),sN=second;
        Node third=new Node(-1),tN=third;
        Node cur=head;
        while(cur!=null){
            Node temp=cur;
            cur=cur.next;
            temp.next=null;
            if(temp.data==0){
                fN.next=temp;
                fN=temp;
            }else if(temp.data==1){
                sN.next=temp;
                sN=temp;
            }else{
                tN.next=temp;
                tN=temp;

            }
        }
        HashSet<Node> map=new HashSet<>();
//        map.contains(List.h);
        sN.next=third.next;
        fN.next=second.next;

        return first.next;
    }
    public static Node reversaLis(Node head){
         print(head);
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node f=cur.next;

            cur.next=prev;
            prev=cur;

            cur=f;
        }
        print(prev);
        return prev;
    }
    public static Node reverseKGroup(Node head, int k) {
        Node cur=head;
        int i=1;
        Node dummy=new Node(-1),dn=dummy;
        Node h=null;
        while(cur!=null){
            Node front=cur.next;
            if(h==null)h=cur;
            if(i%k==0){
                cur.next=null;
                Node tt=reversaLis(h);
//                dn.next=tt;
                while(tt!=null){
                    dn.next=tt;
                    dn=tt;
                    tt=tt.next;
                }

                print(dummy);
                h=null;
            }
            cur=front;i++;
        }
        dn.next=h;
        return dummy.next;

    }
    public static Node rev(Node head){
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node front=cur.next;
            cur.next=prev;
            prev=cur;
            cur=front;
        }
        print(prev);
        return prev;
    }
    public static Node rotateRight(Node head, int k) {
        Node cur=head;
        int i=0;
        while(cur!=null){
            cur=cur.next;i++;
        }
        Node n=new Node(-1),dn=n;
        System.out.println(i+"k"+k);
        if(i>k){
            int r=i-k;
            int t=1;
            cur=head;
            while(cur!=null){
                if(t==r){
//                    print(cur.next);/
                    Node td=cur.next;
                    cur.next=null;
                    while(td!=null){
                        dn.next=td;
                        dn=td;
                        td=td.next;
                    }
                    break;
                }
                cur=cur.next;t++;
            }
        }else{
            int r=i-(k-i);
            int t=1;
            cur=head;
            while(cur!=null){
                if(t==r){
                    System.out.println(t+" "+r);
                    print(cur.next);
                    Node td=cur.next;

                    cur.next=null;
                    while(td!=null){
                        dn.next=td;
                        dn=td;
                        td=td.next;
                    }
                    break;
                }
                cur=cur.next;t++;
            }

        }
        dn.next=head;
        return n.next;
    }
             public static void main(String args[]){
                hLL list=new hLL();
                 list.lastAdd(0);
                list.lastAdd(1);
                 list.lastAdd(2);
//                 list.lastAdd(3);
//                list.lastAdd(4);
//                list.lastAdd(5);
                find(list.head);
//                System.out.println(list.head);
                // print(segregate(list.head));
//                 int i=842141176776;
//                print( reverseKGroup(list.head,2));
                print( rotateRight(list.head,4));
                
             }
         }


