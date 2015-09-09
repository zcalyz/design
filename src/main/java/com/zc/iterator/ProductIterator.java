package com.zc.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ProductIterator extends AbstractIterator{
	private ProductList list;
	
	private List products;
	
	public ProductIterator(ProductList list) {
		// TODO Auto-generated constructor stub
		list = list;
		products = list.getObejects();
	}
	@Override
	boolean hasNext() {
		// TODO Auto-generated method stub

		return cursor != products.size();
	}

	@Override
	Object next() {
		// TODO Auto-generated method stub
		if(cursor >= products.size())
			throw new NoSuchElementException();
		return products.get(cursor++);
	}
}
