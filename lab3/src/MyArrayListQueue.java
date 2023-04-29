import service.MyArrayList;
import service.MyLinkedList;

public class MyArrayListQueue<T> {
    MyLinkedList<T> linkedList = new MyLinkedList<>();

    public MyArrayListQueue(MyLinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }
    public void push(Object element){
        linkedList.add(element);
    }
    public Object remove(){
        return linkedList.remove(linkedList.size()-1);
    }

}
