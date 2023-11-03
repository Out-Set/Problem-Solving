// Given a linked list of 0s, 1s and 2s, sort it.

import java.util.ArrayList;
import java.util.List;

class P5{
    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next.next = new Node(1);

        System.out.print("Initial LL: ");
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();

        System.out.print("After Segregating: ");
        Node hNode = segregate012(head);
        while(hNode != null){
            System.out.print(hNode.data + "->");
            hNode = hNode.next;
        }
    }



    static Node segregate012(Node head){

        List<Integer> al = new ArrayList<>();

        // Copy the Elements from Linked List to ArrayList
        Node curr = head;
        while(curr != null){
            al.add(curr.data);
            curr = curr.next;
        }

        // Sort ArrayList elements in 0, 1 and 2
        int low = 0;
        int mid = 0;
        int high = al.size()-1;

        while(mid<=high){
            if(al.get(mid) == 0){
                int temp = al.get(low);
                al.set(low, al.get(mid));
                al.set(mid, temp);

                low++;
                mid++;
            }
            else if(al.get(mid) == 1){
                mid++;
            }
            else {
                int temp = al.get(mid);
                al.set(mid, al.get(high));
                al.set(high, temp);

                high--;
            }
        }

        // Create LinkedList from sorted ArrayList elements
        Node newHead = new Node(al.get(0));
        Node newCurr = newHead;

        for(int i=1; i<al.size(); i++){
            newCurr.next = new Node(al.get(i));
            newCurr = newCurr.next;
        }
        newCurr.next = null;

        return newHead;
    }
}