import service.MyArrayList;

public class MyArrayListStack {
    MyArrayList arrayList = new MyArrayList();

    public MyArrayListStack(MyArrayList arrayList) {
        this.arrayList = arrayList;
    }
    public void push(Object element){
        arrayList.add(element);
    }
    public Object pop(){
        arrayList.remove(arrayList.size()-1);
        return arrayList.get(arrayList.size()-1);
    }
    public Object peek(){
        return arrayList.get(arrayList.size()-1);
    }
}
