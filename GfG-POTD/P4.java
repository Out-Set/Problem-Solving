import java.util.HashSet;

// Remove duplicates from an unsorted linked list

public class P4 {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(20);
        head.next.next.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next.next.next = new Node(50);

        // Initial LinkedList
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        // After Removal of Duplicates
        System.out.println();
        Node newHead = remDupsNode(head);
        Node curr1 = newHead;
        while(curr1 != null){
            System.out.print(curr1.data + " ");
            curr1 = curr1.next;
        }
    }


    static Node remDupsNode(Node head){

        if(head == null){
            return null;
        }

        // Empty HashSet
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(head.data);
        Node newHead = new Node(head.data);
        Node newNode = newHead;

        Node curr = head.next;

        // Copying only distinct data to HashSet also Creating LinkedList with distinct data
        while(curr != null){
            if(!hs.contains(curr.data)){
                newNode.next = new Node(curr.data);
                newNode = newNode.next;
                hs.add(curr.data);
            }

            curr = curr.next;
        }
        return newHead;
    }
}
