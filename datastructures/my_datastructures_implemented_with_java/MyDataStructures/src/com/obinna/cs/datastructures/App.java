/**
 * Here is the main executable class for MyDataStructures
 * implemented with Java
 * 
 * @author okalu
 * @since 2022-03-25
 */
package com.obinna.cs.datastructures;

import com.obinna.cs.datastructures.list.linkedlist.singlylinkedlist.SinglyLinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Data Structures World!");
        var app = new App();
        app.testSinglyLinkedList();
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
