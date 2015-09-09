package com.zc.iterator;

abstract class AbstractIterator {
	public int cursor;
	
	abstract boolean hasNext();
	
	abstract Object next();
}
