package com.zc.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ProductList extends AbstractObjectList{
	
	public ProductList(List objects) {
		super(objects);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractIterator createIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator(this);
	}
	
	public AbstractIterator Iterator(){
		return new ProductItr();
	}
	private class ProductItr extends AbstractIterator{
		
		public ProductItr() {
			// TODO Auto-generated constructor stub
		
		}
		
		@Override
		boolean hasNext() {
			// TODO Auto-generated method stub
			return cursor != ProductList.this.objects.size();
		}

		@Override
		Object next() {
			// TODO Auto-generated method stub
			if(cursor >= objects.size())
				throw new NoSuchElementException();
			return objects.get(cursor++);
		}
		
	}

}
