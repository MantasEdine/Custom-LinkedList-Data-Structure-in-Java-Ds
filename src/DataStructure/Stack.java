package DataStructure;

import java.util.Arrays;

public class Stack {

    private int count = 0;
    private int count02 =0;
    private int peekTracker =0 ;
    private int[] items;

    public Stack() {
        items = new int[10]; // Initial capacity of the stack
    }

    public void push(int item) {
        if (count >= items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
        peekTracker = item; 
    }

    public void pop() {
        if (count > 0) {
            count--;
        }
    }

    public void peek() {
        if (count > 0) {
          
            System.out.println(peekTracker);
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }
    public void minimum(){
        var minValue = 0;
        
        for (int i = 0; i < count; i++) {
            for (int j = 1; j < count; j++) {
                if(items[i]<items[j]) {
                 minValue = items[i];
                }
            }
        }
        System.out.println(minValue);
    }
}
