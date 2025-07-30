package generics;

import packages.A;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T > {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public T remove() {
        T remove = (T) (data[size--]);
        return remove;
    }

    public int size(){
        return  size;
    }

    public void set(int index, T num){
        data[index]=num;
    }

    public T get(int index){
        return (T) (data[index]);
    }

    public void add(T num){
        if (isFull()) {
            resize();
        }
        data[size++]=num;
    }

    public void resize(){
        Object[] arr=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            arr[i]= (int) data[i];
        }
        data=arr;

    }

    public boolean isFull(){
        return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
