package com.obinna.cs.datastructures.list.linkedlist.singlylinkedlist;

/**
 * SinglyLinkedListApp.java
 * This is the executable for the SinglyLinkedList implementation
 * 
 * @author okalu
 * @since 2022-05-17
 */
class SinglyLinkedListApp {
    public static void main(String[] args) {
        System.out.println("Hello, Starting SinglyLinkedListApp!");
        var app = new SinglyLinkedListApp();
        app.testSinglyLinkedList();
        System.out.println("Good bye, finished SinglyLinkedListApp!");
    }

    private void testSinglyLinkedList() {
        var sll = new SinglyLinkedList<Integer>();
        System.out.printf("Number of items: %d\n", sll.getSize());
        System.out.printf("Empty SinglyLinkedList: %s\n", sll);
        sll.add(1); sll.add(2); sll.add(3);
        System.out.printf("Number of items: %d\n", sll.getSize());
        System.out.printf("SinglyLinkedList after adding: %s\n", sll);
        sll.reverse();
        System.out.printf("Number of items: %d\n", sll.getSize());
        System.out.printf("SinglyLinkedList after reversing: %s\n", sll);
    }
}