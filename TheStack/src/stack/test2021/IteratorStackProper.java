package stack.test2021;

import java.util.Iterator;

public class IteratorStackProper<E> implements Iterator<E> {

    StackProper<E> stack;
    
    public IteratorStackProper(StackProper<E> stack) {
    	this.stack = stack;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E next() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
