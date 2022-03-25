package com.obinna.cs.datastructures.list;
/**
 * This class defines default (or sometimes none) implementation
 * of operations for a List
 * 
 * @author okalu
 * @since 2022-03-25
 */
public class AbstractList<E> implements List<E> {
    protected Integer size = 0;

    public Integer getSize() {
        return this.size;
    }

    @Override
    public void add(E e) {
        // noop -- This method intentionally does nothing here (requires overriding in sub-classes)
    }

    @Override
    public void reverse() {
        // noop -- Intentionally does nothing here
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
