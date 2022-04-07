class ImplementQueueUsingStacks {
  // 232. problems/implement-queue-using-stacks/ [NB]
    
    Stack<Integer> stackOne;
    Stack<Integer> stackTwo;
    boolean modified = false;

    public MyQueue() {
        stackOne = new Stack<Integer>();
        stackTwo = new Stack<Integer>();
    }
    
    public void push(int x) {
        stackOne.push(x);
    }
    
    public int pop() {
        if (stackTwo.isEmpty()) {
            reFill();
        }
        return stackTwo.pop();
    }
    
    public int peek() {
        if (stackTwo.isEmpty()) {
            reFill();
        }
        return stackTwo.peek();
    }
    
    public boolean empty() {
        return stackTwo.isEmpty() && stackOne.isEmpty();
    }
    
    private void reFill() {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
