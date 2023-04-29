import service.MyArrayList;

public class MyArrayListStack {
    MyArrayList arrayList = new MyArrayList();

    public MyArrayListStack(MyArrayList arrayList) {
        this.arrayList = arrayList;
    }
    public void push(Object element){
        arrayList.add(element);
    }

}
