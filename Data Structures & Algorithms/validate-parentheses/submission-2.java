class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        int i = 1;
        while( i < s.length()){
            if(!st.isEmpty() && st.peek() == '(' && s.charAt(i) == ')'){
                st.pop();
            }
            else if(!st.isEmpty() && st.peek() == '{' && s.charAt(i) == '}'){
                st.pop();
            }
            else if(!st.isEmpty() && st.peek() == '[' && s.charAt(i) == ']'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
            System.out.println(i);
        }

        return st.isEmpty();
    }
}
