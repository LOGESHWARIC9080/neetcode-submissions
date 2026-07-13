class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(isNumber(tokens[i])){
                int num=Integer.parseInt(tokens[i]);
                stack.push(num);
            }
            else{
                String ch=tokens[i];
                int res=0;
                int b=stack.pop();
                int a=stack.pop();
                switch(ch){
                    case "+":
                        res=a+b;
                        break;
                    case "-":
                        res= a-b;
                        break;
                    case "*":
                        res=a*b;
                        break;
                    case "/":
                        res=a/b;
                        break;
                }
                stack.push(res);
            }

        }
     return stack.pop();   
    }
    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
