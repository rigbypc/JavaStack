package stack.test;

import java.util.Iterator;
import java.util.Stack;

public class StackProper<E> extends Stack<E> {

	@Override
	public synchronized Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}

}
