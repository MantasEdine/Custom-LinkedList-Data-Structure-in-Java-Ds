package DataStructure;
public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList(){

    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void addLast(int item) {
        var node = new Node(item);
 if(isEmpty()){
  first = last = node;
 }
 else {
    last.next = node;
    last = node;
}
 }
 public void addFirst(int item) {
           var node = new Node(item);
 if(isEmpty()){
  first = last = node;
 }
 else {
    first.next = node;
    first = node;
 }
}
 public int indexOf(int value){
 int index = 0;
 var current = first;
 while( current != null){
  if(current.value == value) return index;
  else {
    current = current.next;
    index++;
  }
 } return -1;
 }
  public boolean contains(int value){
 
 var current = first;
 while( current != null){
  if(current.value == value) return true;
  else {
    current = current.next;
  }
 } return false;
 }

 public void deleteFirst(){
    if(isEmpty()){
        throw new IllegalStateException();
    }
var second = first.next;
first.next = null;
first = second;
 }
 public void deleteLast(){
        if(isEmpty()){
        throw new IllegalStateException();
    }
    if(first == last){
        first = last = null;
    }

  var previous = getPrevious(last);
  last.next = null;
  last = previous;

 }
   private Node getPrevious(Node node){
   var current = first;
    while (current != null) {
        if(current.next == node) return current;current = current.next; //
    }
    
     return null;
   }
  
    private boolean isEmpty(){
        return first == null;
    }

}