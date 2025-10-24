
package U2.ArrayStack;
public interface IStack<T> {

    void push(T data);
    T pop();
    T peek();
    void clear();
    int size();
    boolean isEmpty();
    void print();
}
