package DataStructure;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int count;
    private int F;
    private int R;

    public ArrayQueue(int length) {
        items = new int[length];
       
    }

   public void enqueue(int item){
    if(count>=items.length){
        throw new IllegalStateException();
    }
   items[R]=item;
    R = (R+1)%items.length;
    count++;
    
   }
   public void dequeue() {
   items[F]=0;
   F = (F+1)%items.length;
   count--;
   
   }
   @Override
   public String toString() {
   return Arrays.toString(items);
   }
}
