package com.obinna.cs.datastructures.list.linkedlist.singlylinkedlist;

import java.util.StringJoiner;

import com.obinna.cs.datastructures.list.AbstractList;
/**
 * This is a SinglyLinkedList class
 */
public class SinglyLinkedList<E> extends AbstractList<E> {
    private ListItem<E> first;
    private ListItem<E> last;

    public SinglyLinkedList(ListItem<E> first, ListItem<E> last) {
        this.first = first;
        this.last = last;
        if(this.first != null)
            this.first.next = last;
    }

    public SinglyLinkedList(ListItem<E> first) {
        this(first, null);
    }

    public SinglyLinkedList() {
        this(null, null);
    }

    /**
     * Adds a new item into the list
     */
    @Override
    public void add(E e) {
        ListItem<E> newItem = new ListItem<>(e);
        if(first == null) {
            first = last = newItem;
        } else {
            last.next = newItem;
            last = newItem;
        }
        ++size;
    }

    /**
     * This method reverses the order of the items in the list,
     * making the first to become last and vice versa
     */
    @Override
    public void reverse() {
        if(this.first == null || size < 2)
            return;
        var currentItem = first;
        ListItem<E> currNext = null;
        ListItem<E> newNext = null;
        last = currentItem;
        while(currentItem != null) {
            currNext = currentItem.next;
            currentItem.next = newNext;
            newNext = currentItem;
            currentItem = currNext;
        }
        first = newNext;
    }

    /**
     * Returns a string representation of items in the list
     */
    @Override
    public String toString() {
        var sj = new StringJoiner(", ", "[", "]");
        var currentItem = first;
        while(currentItem != null) {
            sj.add(currentItem.data.toString());
            currentItem = currentItem.next;
        }
        return sj.toString();
    }

    /**
     * This is a ListItem implemented here as a static nested class
     */
    private static class ListItem<E> {
        private E data;
        private ListItem<E> next;
        
        private ListItem(E data, ListItem<E> next) {
            this.data = data;
            this.next = next;
        }

        private ListItem(E data) {
            this(data, null);
        }

        private ListItem() {
            this(null, null);
        }

        @Override
        public String toString() {
            return String.format("ListItem{data: %s, next: %s}", data, next);
        }

    }

}
