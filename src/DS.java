import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DS {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(4);
        queue.add(6);
        queue.add(5);
        queue.add(9);
        queue.add(8);
        queue.add(100);
        queue.add(157);
        queue.add(784);
        queue.add(10000);
        
        Queue<Integer> reversedQueue = reversingQueue(queue);
        reversedQueue.remove();
       System.out.println( reversedQueue.peek());
        System.out.println(reversedQueue);
    }

    public static Queue<Integer> reversingQueue(Queue<Integer> queue) {
        LinkedList<Integer> test = new LinkedList<>();
        while (!queue.isEmpty()) {
            var removedItem = queue.remove();
            test.addFirst(removedItem);
        }
        
        while (!test.isEmpty()) {
            var removedItem = test.remove();
            queue.add(removedItem);
        }
        
        return queue;
    }
}
