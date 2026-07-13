class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> MinStack;

    public MinStack() {
        stack=new Stack<>();
        MinStack=new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(MinStack.isEmpty()||MinStack.peek()>=val){
            MinStack.push(val);
        }
        
    }
    
    public void pop() {
        int remove=stack.pop();
        if(remove==MinStack.peek()){
            MinStack.pop();

        }

        
    }
    
    public int top() {
        return(stack.peek());
        
    }
    
    public int getMin() {
        return(MinStack.peek());
        
    }
}
