package Stack;
import java.util.Stack;

public class CopyStack {
    static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       System.out.println(st);
       Stack<Integer> st2 = new Stack<>();
       while(st.size()>0){ // reverse order
           int x = st.peek();
           st2.push(x);
           st.pop();
       }
        System.out.println(st2);
       // same order by using another 3rd stack
       Stack<Integer> st3  = new Stack<>();
       while(st2.size()>0){
           int x = st2.peek();
           st3.push(x);
           st2.pop();
       }
        System.out.println(st3);

    }
}
