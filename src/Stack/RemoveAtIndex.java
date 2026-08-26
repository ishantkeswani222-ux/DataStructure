package Stack;
import java.util.Stack;
public class RemoveAtIndex {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        System.out.println(st);
        Stack<Integer> st2 = new Stack<>(); // taking a new stack
        while (st.size()>1) { // shifting elements to new stack till the required index
            st2.push(st.pop());
        }
        st.pop(); // removing the element at tht index
        while(st2.size()>0) { //  shifting the old elements to same stack
            st.push(st2.pop());
        }
        System.out.println(st);
    }


}
