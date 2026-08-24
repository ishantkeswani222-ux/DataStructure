package Stack;
import java.util.Stack;

public class BasicsOfStacks {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.peek();
        System.out.println(st.pop());
        System.out.println(st);

    }
}
