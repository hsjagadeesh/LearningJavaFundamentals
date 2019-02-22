package com.learning.java.datastructure;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SortedDoubleLinkedList {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode currentNode = head;
        DoublyLinkedListNode previousNode = head;

        if(currentNode == null){
            DoublyLinkedListNode insertNode = new DoublyLinkedListNode(data);
            insertNode.next = null;
            insertNode.prev = null;
            return insertNode;
        }
        while(currentNode != null && currentNode.data < data) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        DoublyLinkedListNode insertNode = new DoublyLinkedListNode(data);

        if(previousNode == currentNode){
            insertNode.next = currentNode;
            currentNode.prev = insertNode;
        } else {
            previousNode.next = insertNode;
            insertNode.prev = previousNode;

            insertNode.next = currentNode;
            if (currentNode != null)
                currentNode.prev = insertNode;
        }

        while(head.prev != null) {
            head = head.prev;
        }
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            DoublyLinkedList llist = new DoublyLinkedList();

            int llistCount = scanner.nextInt();

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();

                llist.insertNode(llistItem);
            }

            int data = scanner.nextInt();

            DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);

            while(llist1 != null) {
                System.out.print(llist1.data + " ");
                llist1=llist1.next;
            }
        }

        scanner.close();
    }
}
