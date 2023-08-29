package DataStructure;
import java.util.Stack;

public class StackQueue<T> {
    private Stack<T> enqStack;
    private Stack<T> deqStack;

    public StackQueue() {
        enqStack = new Stack<>();
        deqStack = new Stack<>();
    }

    public void enqueue(T item) {
        while (!deqStack.isEmpty()) { 
            enqStack.push(deqStack.pop());
        }
        enqStack.push(item);
        
    }

    public T dequeue() {
        if (deqStack.isEmpty()) {
            while (!enqStack.isEmpty()) { 
                deqStack.push(enqStack.pop());
            }
        }
        if (deqStack.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deqStack.pop(); 
    }
}
