import java.util.LinkedList;
import java.util.Queue;

//Stack sing single Queue
//Initialization (MyStack()): An empty queue, q, is created when the MyStack object is instantiated.
//Push Operation (push(int x)): The push operation is implemented by adding the element to the queue and then rotating the queue until the newly added element is at the front of the queue. This ensures that the last pushed element is always at the front of the queue, ready to be popped or peeked.
//Pop Operation (pop()): The pop operation is implemented by simply removing the element at the front of the queue, which is the last pushed element.
//Top Operation (top()): The top operation is implemented by returning the element at the front of the queue, which is the last pushed element, without removing it.
//Empty Check (empty()): This operation checks if the queue is empty. If it is, the stack is considered empty.
public class leetcode_225_implement_stack_using_Queues {
    Queue<Integer> q=new LinkedList<>();

    public leetcode_225_implement_stack_using_Queues() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        if(q.size()==0){
            return true;
        }
        return false;
    }
}
