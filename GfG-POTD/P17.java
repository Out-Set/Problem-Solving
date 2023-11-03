// Reverse a Stack

import java.util.ArrayList;
import java.util.Stack;

public class P17 {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);

        System.out.println("Current stack: ");
        System.out.println(st);

        System.out.println("After reversing: ");
        revStack(st);
        System.out.println(st);
        
    }


    static void revStack(Stack<Integer> st){
        ArrayList<Integer> al = new ArrayList<>();

        while(!st.isEmpty()){
            al.add(st.pop());
        }

        for(int i=0; i<al.size(); i++){
            st.push(al.get(i));
        }
    }
}
