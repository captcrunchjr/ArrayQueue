package ADTs;

import Exceptions.EmptyCollectionException;
import Exceptions.QueueOverflowException;

public interface QueueADT<T> extends CollectionADT<T> {
    public void enqueue(T element) throws QueueOverflowException;

    public T dequeue() throws EmptyCollectionException;

    public T peek() throws EmptyCollectionException;
}
