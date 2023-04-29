import service.MyArrayList;
import java.util.NoSuchElementException;



public class MyArrayListQueue<T> {
    MyArrayList<T> list = new MyArrayList<>();

    public MyArrayListQueue(MyArrayList<T> list) {
        this.list = list;
    }

    /**
     * @push - method that adds an element to the back of the queue
     * @param element
     */
    public void push(Object element){
        list.add(element);
    }

    /**
     * @remove - method that removes and returns the front element of the queue
     * @return - removed element
     */
    public Object remove(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.remove(list.size()-1);
    }

    /**
     * @peek - method that returns the front element of the queue without removing it
     * @return - the font element of th queue
     */
    public Object peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    /**
     * @size - method that returns the number of elements in the queue
     * @return - size(int)
     */
    public int size(){
        return list.size();
    }

    /**
     * @isEmpty -  method that returns true if the queue is empty or false if it is not
     * @return - true/false
     */
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
