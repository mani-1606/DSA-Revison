import java.util.Stack;
//lc = 20
public class ValidParenthesis {
    public boolean isValid(String s) {
       int n = s.length();
       if(n%2==1) return false;
       Stack<Character> st = new Stack<>();
       for(int i=0; i<n; i++){
           if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[') st.push(s.charAt(i));
           else {
               if(st.size()==0) return false;
               char top = st.peek();
               if(Compare(s.charAt(i),top)) st.pop();
               else return false;
           }
       }
       return (st.size()==0);
    }

    private boolean Compare(char left, char right) {
        if(left == '}' && right == '{') return true;
        if(left == ']' && right == '[') return true;
        if(left == ')' && right == '(') return true;
        return false;
    }
}
