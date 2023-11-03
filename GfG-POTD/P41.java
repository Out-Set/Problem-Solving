// Remove duplicate element from sorted Linked List

public class P41 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);

        Node res = removeDuplicates(head);
        while(res.next != null){
            System.out.println(res.data);
            res = res.next;
        }
    }

    static Node removeDuplicates(Node head) {
	    // Your code here

        Node curr = head;

        while (curr != null) {
            Node temp = curr;

            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }

        return head;    	    	
    }
}
