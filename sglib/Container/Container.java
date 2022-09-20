package sglib.Container;

import java.util.LinkedList;

public abstract class Container <T>{
    LinkedList<T> objects = new LinkedList<T>();

    public Container(){
        container();
        createAll();
    }

    public abstract void container();
    protected abstract void createAll();
    public void addContainer(T object){
        this.objects.add(object);
    }
    public LinkedList<T> getAll(){
        return objects;
    }
    // short usage
    public T get(int index){
        return objects.get(index);
    }
}
