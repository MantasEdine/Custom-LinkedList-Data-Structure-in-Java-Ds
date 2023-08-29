import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import DataStructure.PriorityQueue;

public class DS {

    public static void main(String[] args) {
      PriorityQueue<Integer> queue = new PriorityQueue<Integer>(5);
      queue.enqueue(5);
      queue.enqueue(4);
      queue.enqueue(3);
      queue.enqueue(2);
      queue.enqueue(9);
     System.out.println(queue);
     queue.dequeue();
     System.out.println(queue.dequeue());
     System.out.println(queue.peek());
    }

    
}
