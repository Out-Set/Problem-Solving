// Delete nodes having greater value on right

// Given a singly linked list, remove all the nodes in the list which have any node on their right whose value is greater. 
// (Not just immidiate Right , but entire List on the Right)

public class P42 {
    public static void main(String[] args) {
        
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(3);

        Node res = compute(head);
        while(res!=null){
            System.out.print(res.data + "->");
            res = res.next;
        }
    }

    static Node reverse(Node head) {
        Node prev=null,next=null;
        
        while(head!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
            
            return prev;
    }

    static Node compute(Node head) {
        Node rev=reverse(head);
        Node ans=new Node(-1);
        Node ptr=ans;
        
        while(rev!=null){
            if(rev.data>=ptr.data)
            {
                ptr.next=rev;
                ptr=ptr.next;
            }
            
            rev=rev.next;
        }
        
        ptr.next=null;
        
        return reverse(ans.next);
    }
}
