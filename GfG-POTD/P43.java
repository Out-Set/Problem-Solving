class P43 {
    public static void main(String[] args) {
        
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);

        int x = 2;

        Node res = deleteNode(head, x);
        while(res!=null){
            System.out.println(res.data);
            res = res.next;
        }
    }

    static Node deleteNode(Node head, int x) {
	    // Your code here
        if(x==1){
	        return head.next;
        }
	    Node temp=head;
	    for(int i=1;i<x-1;i++){
	        temp=temp.next;
	    }
	    temp.next=temp.next.next;
	    return head;
    }
}