package com.learning.java.datastructure;

import java.io.IOException;
import java.util.Scanner;

public class SingleLinkedList {

    private static final Scanner scanner = new Scanner(System.in);

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        if(head == null) {
            return head;
        }

        SinglyLinkedListNode prevNode = null;
        SinglyLinkedListNode currentNode = head;
        int currentIndex = 0;
        while(currentNode.next != null) {
            if(currentIndex==position) {
                break;
            } else {
                currentIndex++;
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        if(currentNode.next != null) {
            prevNode.next = currentNode.next;
        } else {
            prevNode.next = null;
        }
        return head;
    }

    public static void main(String[] args) throws IOException {


        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printSinglyLinkedList(llist1);

        scanner.close();
    }
}
