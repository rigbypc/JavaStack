package stack.test2021;

import java.util.Iterator;

public class IteratorStackProper<E> implements Iterator<E> {

    StackProper<E> stack;
    
    public IteratorStackProper(StackProper<E> stack) {
    	this.stack = stack;
    }

    @Override
    public boolean hasNext() {
    	return !stack.isEmpty();
    }

    @Override
    public E next() {
        return stack.pop();
    }
    
}
