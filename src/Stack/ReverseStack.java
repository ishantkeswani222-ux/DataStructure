package Stack;
import java.util.Stack;
public class ReverseStack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        System.out.println(st);
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        while(st2.size()>0){
            rt.push(st2.pop());
        }
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
