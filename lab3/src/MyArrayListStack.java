import service.MyArrayList;
import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> arrayList = new MyArrayList<>();

    public MyArrayListStack(MyArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
    public void push(Object element){
        arrayList.add(element);
    }
    public Object pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.remove(arrayList.size()-1);
    }
    public Object peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.get(arrayList.size()-1);
    }
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
    public int size(){
        return arrayList.size();
    }
}
