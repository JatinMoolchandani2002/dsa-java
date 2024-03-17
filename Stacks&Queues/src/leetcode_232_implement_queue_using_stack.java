import java.util.Stack;

//  Initialization: Two empty stacks, input and output, are created when the MyQueue object is instantiated.
//Push Operation (push(int x)): The push operation is implemented by simply pushing the element onto the input stack.
//Pop Operation (pop()): The pop operation is a bit more complex:
    //If the output stack is empty, all elements from the input stack are moved to the output stack, effectively reversing the order of the elements.
    //Then, the top element of the output stack (which is the oldest element of all elements currently in the queue) is removed and returned.
//Peek Operation (peek()): This operation is similar to the pop operation, but it returns the oldest element without removing it:
    //If the output stack is empty, all elements from the input stack are moved to the output stack.
    //Then, the top element of the output stack is returned.
//Empty Check (empty()): This operation checks if both the input and output stacks are empty. If both are empty, the queue is considered empty.

class leetcode_232_implement_queue_using_stack {
    Stack <Integer> output = new Stack<>();
    Stack <Integer> input = new Stack<>();
    public leetcode_232_implement_queue_using_stack () {

    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if(output.empty()){
            while (!input.empty()) {
                output.push(input.peek());
                input.pop();
            }
        }

        int x= output.peek();
        output.pop();
        return x;
    }

    public int peek() {
        if(output.empty()){
            while (!input.empty()) {
                output.push(input.peek());
                input.pop();
            }
        }

        int x= output.peek();
        return x;
    }

    public boolean empty() {
        if(input.empty() && output.empty()){
            return true;
        }
        return false;
    }
}
