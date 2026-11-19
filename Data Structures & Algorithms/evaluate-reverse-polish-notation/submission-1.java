class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<tokens.length; i++){
            String str = tokens[i];
            int n1 = 0, n2 = 0;
            switch(str){
                case "+":
                    n2 = stack.pop();
                    n1 = stack.pop();
                    stack.push(n1+n2);
                    break;
                case "-":
                    n2 = stack.pop();
                    n1 = stack.pop();
                    stack.push(n1-n2);
                    break;
                case "/":
                    n2 = stack.pop();
                    n1 = stack.pop();
                    stack.push(n1/n2);
                    break;
                case "*":
                    n2 = stack.pop();
                    n1 = stack.pop();
                    stack.push(n1*n2);
                    break;
                default:
                    stack.push(Integer.parseInt(str));
            }
        }
        return stack.peek();
    }
}
