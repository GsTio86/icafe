package com.icafe4j.io;

import java.util.Iterator;

public abstract class RandomInputStreamAdaptor<E> implements Iterator<RandomAccessInputStream> {

  private final int size;
  protected E[] input;
  protected int index;

  public RandomInputStreamAdaptor(E[] streams) {
		if (streams == null) {
			throw new IllegalArgumentException("Input array is null");
		}
		if (streams.length == 0) {
			throw new IllegalArgumentException("Input array is empty");
		}
    this.input = streams;
    this.size = streams.length;
  }

  public boolean hasNext() {
    return index < size;
  }
}