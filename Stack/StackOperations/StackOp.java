class StackOp implements StackMethods {
    private int [] stackArray;
    private int top;
    private int maxSize;

    public StackOp (int size){
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // initiatlly stack is empty

    }

    @Override
    public void push(int value) {
        if(isFull()){
        throw new UnsupportedOperationException("Stack is full");
        }
        stackArray[++top] = value;
    }

    @Override
    public int pop() {
        if(isEmpty()){
        throw new UnsupportedOperationException("Stack is empty");
        }
        return stackArray[top--];
    }

    @Override
    public int peek() {
        if(isEmpty()){
        throw new UnsupportedOperationException("Stack is empty'");
        }
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
        
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
       
    }
    
        
 }
