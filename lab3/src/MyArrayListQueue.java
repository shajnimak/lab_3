import service.MyArrayList;
import java.util.NoSuchElementException;



public class MyArrayListQueue<T> {
    MyArrayList<T> list = new MyArrayList<>();

    public MyArrayListQueue(MyArrayList<T> list) {
        this.list = list;
    }
    public void push(Object element){
        list.add(element);
    }
    public Object remove(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.remove(list.size()-1);
    }
    public Object peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
