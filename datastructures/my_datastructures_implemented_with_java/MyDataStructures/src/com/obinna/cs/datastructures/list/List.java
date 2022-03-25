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
    /* TODO
    * addFirst(E e)
    * addLast(E e)
    * insertAt(int index, E e)
    * get(int index)
    * findFirst(E e)
    * findLast(E e)
    * findAny(E e)
    * findAll(E e)
    * getIndexOf(E e)
    * removeFirst()
    * removeLast()
    * remove(E e)
    * removeAll(E e)
    * removeAt(int index)
    * clear()
    * contains(E e): boolean
    */

}
