package com.bridgelabz.oops;
import java.util.List;
public class QueueUsingLL<T> {
    LinkedList<T> queue = new LinkedList<T>();
    int size = 0;

    public void enQueue(Object data) {
        queue.add(data);
        size++;
    }

    public void enQueueAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            enQueue(list.get(i));
        }
    }

    public void deQueue() {
        if (!isEmpty()) {
            queue.deleteAtStart();
            size--;
        }

    }

    public T get(int index) {
        if (index < size) {
            return queue.get(index);
        } else {
            return null;
        }
    }

    public T get() {
        T data=queue.get(size-1);
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String show() {
        return queue.show();
    }
}
