public class StackMain {
    public static void main(String[] args) {
        StackOp stack = new StackOp(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        try{
           //try to push another element when stack is full
            //stack.push(60);

        }
        catch(IllegalStateException e){
            System.out.println("Exception occured" + e.getMessage());
        }

        //peek element from the top of the stack
        System.out.println("Top element of the stack is " + stack.peek());

        //pop the stack elemets utill the stack is empty
        while(!stack.isEmpty()){
            System.out.println("Popped element is " + stack.pop());
        }
        
        try{
            //try to pop element from empty stack

        }
        catch(IllegalStateException e){
            System.out.println("Exception occured" + e.getMessage());
            
        }

        // to check is the stack is empty or not
        System.out.println("Is the stack empty? " + stack.isEmpty());

    
}

}
