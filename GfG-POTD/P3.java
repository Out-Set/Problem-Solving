class Node {
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

// Reverse a Linked List in groups of given size.

class P3 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();

        // Calling
        int k = 4;
        Node res = revSizek(head, k);
        while(res != null){
            System.out.print(res.data + " ");
            res = res.next;
        }
    }

    static Node revSizek(Node head, int k){

        Node curr = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        while(curr != null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if(next != null){
            Node rest_head = revSizek(next, k);
            head.next = rest_head;
        }

        return prev;
    }
}