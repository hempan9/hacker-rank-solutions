package com.hackerranck;

import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.Node;

public class ArrayMan<T> {
	private int size;
	private List<T> list= new LinkedList<T>();
	Node left, right;
	
	public ArrayMan(int size) {
		this.size = size;
	}

	public int length() {
		return this.size;
	}

	public void print() {
		for(T t: list) {
			System.out.print(t+", ");
		}
	}
	public void add(T e) {
		//Dynamic array which will increase 
		//if the initial declared size is full 
		this.list.add(e);
	}
	public T index(int index) {
		for(int i = 0; i<this.size; i++) {
				if (list.size()>index) {
					return list.get(index);
					
				}
				else {
					throw new IndexOutOfBoundsException("Index outboud for input: "+index);
				}
		}		
		return null;
	}

	public void getNodes() {
		this.left.
	}
	
	public static void main(String[] args) {
		ArrayMan array = new ArrayMan(3);
		array.add(1);
		array.add(1);
		array.add(1);
		array.add(2);
		array.add(3);
		array.print();
		array.add(1);

		System.out.println("index: "+array.index(5));
	}
}
