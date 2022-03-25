package com.obinna.cs.datastructures.list;
/**
 * This interface defines the general abstract
 * operations that any List must provide/implement
 * 
 * @author okalu
 * @since 2022-03-25
 */
public interface List<E> {
    
    public abstract void add(E e);
    public void reverse();
    public abstract String toString();

}
