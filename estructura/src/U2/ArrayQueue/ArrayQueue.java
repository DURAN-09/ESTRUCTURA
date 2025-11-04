package U2.ArrayQueue;

import java.util.Stack;

public class ArrayQueue<T> {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.data = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        data[rear] = item;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T item = (T) data[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public void reverse() {
        Stack<T> stack = new Stack<>();

        while (!isEmpty()) {
            stack.push(dequeue());
        }

        while (!stack.isEmpty()) {
            enqueue(stack.pop());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            sb.append(data[index]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
