import java.util.Stack;

public class balanced_paranthesis {
    public boolean isValid(String s) {
        Stack<Character>st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            st.push(ch);
            else
            {
                if(st.isEmpty())
                return false;
                char c2 = st.peek();
                if(( c2=='(' && ch==')')  || ( c2=='[' && ch==']') || ( c2=='{' && ch=='}'))
                st.pop();
                else
                return false;
            }
        }
        return st.isEmpty();
    }
}
