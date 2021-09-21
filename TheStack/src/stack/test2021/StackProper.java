package stack.test2021;

import java.util.Iterator;
import java.util.Stack;

public class StackProper<E> extends Stack<E>{

	@Override
	public synchronized Iterator<E> iterator() {
		return new IteratorStackProper<>(this);
	}
 

}
