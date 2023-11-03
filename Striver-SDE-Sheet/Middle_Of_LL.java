package Linked_List;

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}
class Middle_Of_LL{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(60);

        Node midNode = new Middle_Of_LL().midNode(head);
        System.out.println(midNode.data);

    }

    public Node midNode(Node head) {

        int size = sizeOfLL(head);
        int mid = ((size)/2) +1;
        System.out.println("mid=" + mid);
        Node curr = head;
        for(int i=1; i<mid && curr!=null; i++){
            curr = curr.next;
        }
        return curr;
    }

    int sizeOfLL(Node head) {
        if(head == null){
            return 0;
        }

        int size = 0;
        Node curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        System.out.println(size);

        return size;

    }

}