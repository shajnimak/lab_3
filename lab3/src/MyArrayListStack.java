import service.MyArrayList;
import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> arrayList = new MyArrayList<>();

    public MyArrayListStack(MyArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    /**
     * @push - method that adds an element to the top of the stack
     * @param element - Object
     */
    public void push(Object element){
        arrayList.add(element, 0);
    }

    /**
     * @pop - remethod that removes and returns the top element of the stack
     * @return - removed element
     */
    public Object pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.remove(0);
    }

    /**
     * @peek - gmethod that returns the top element of the stack without removing it
     * @return - top element of stack
     */
    public Object peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.get(0);
    }

    /**
     * @isEmpty - method that returns true if the stack is empty or false if it is not
     * @return - true/false
     */
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    /**
     * @size -  method that returns the number of elements in the stack
     * @return - size(int)
     */
    public int size(){
        return arrayList.size();
    }
}
