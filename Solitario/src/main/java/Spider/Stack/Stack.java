package Spider.Stack;

public interface Stack<E> {

    boolean push(E element);

    E pop();

    E peek();

    boolean isEmpty();
}
