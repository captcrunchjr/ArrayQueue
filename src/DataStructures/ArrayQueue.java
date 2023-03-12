package DataStructures;

import java.util.Arrays;

import ADTs.*;
import Exceptions.*;

public class ArrayQueue<T> implements QueueADT<T> {

    int size=0;
    int cap;
    T q[];

    public ArrayQueue(){
        cap = 10;
    }

    public ArrayQueue(int cap){
        this.cap = cap;
        q = (T[]) new Object[cap];
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        if(size+1 >= cap){
            throw new QueueOverflowException();
        }
        q[size] = element;
        size++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        T[] tempStorage = (T[]) new Object[cap];
        T result = q[0];
        int count = 0;
        q[0] = null;
        for(int i = 0; i<size; i++){
            if(q[i]!=null){
                tempStorage[count] = q[i];
                count++;
            }
        }
        q = Arrays.copyOf(tempStorage, cap);
        size--;
        return result;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        return q[0];
    }

    
}