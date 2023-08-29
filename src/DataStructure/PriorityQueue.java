package DataStructure;

import java.util.Arrays;

public class PriorityQueue<T> {

    private int[] items;
    private int count; // This variable should track the current number of elements in the queue

    public PriorityQueue(int length) {
        items = new int[length];
        count = 0; // Initialize the count to 0 since the queue is initially empty
    }

    public void enqueue(int item) {
        int i;
        if (count >= items.length) {
            throw new IllegalStateException("Queue is full");
        } else {
            // Find the correct position to insert the new item
            for (i = count - 1; i >= 0; i--) {
                if (items[i] > item) {
                    items[i + 1] = items[i];
                } else {
                    break;
                }
            }
            items[i + 1] = item;
            count++; // Increment the count after successfully adding an item
        }
    }  
     public int peek(){
        return items[0];
     }
     public int dequeue(){
       
          
       if(isEmpty()){
        throw new IllegalStateException();
       }

        
        return items[--count];
     }
     public boolean isEmpty(){
        return count==0;
     }
    @Override
    public String toString() {
        // Only return the portion of the array that contains elements, not the entire array
        return Arrays.toString(Arrays.copyOf(items, count));
    }
}
