package Stack;

import java.util.Stack;

public record InsertAtIndex() {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        int idx = 2; // index
        int x = 5; //number want to insert
        Stack<Integer> st2 = new Stack<>();
        while (st.size()>idx){
            st2.push(st.pop());
        }
        st.push(x);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);

    }
}
