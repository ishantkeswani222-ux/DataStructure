package Stack;

import java.util.Stack;

public class DisplayStack {
    // other method to display in reverse
    public static void displayRevRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRevRec(st);
        st.push(top);
    }
    // other method to display in order
    public static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        // one method
//        Stack<Integer> st2 = new Stack<>();
//        while(st.size()>0){
//            st2.push(st.pop());
//        }
//        while(st2.size()>0){
//            int x = st2.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }
        //displayRevRec(st);
        display(st);

    }
}
