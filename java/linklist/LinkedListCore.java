package com.java.linklist;

public class LinkedListCore {

    Node head;
    Node tail;
    int size;

    public LinkedListCore() {
    }

    public LinkedListCore(int size) {
        this.size = 0;
    }

    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        //System.out.println(node.next+"--");
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int data) {

        if(tail == null) {
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertMiddle(int data, int index) {

        if(index == 0) {
            insertFirst(data);
            return;
        }
        if(index == size) {
            insertLast(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++) {
            temp = temp.next;
        }

        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int data = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }

        Node secondLast = getIndex(size-2);
        int data = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return data;

    }

    public Node getIndex(int index) {
        Node node = head;
        for(int i=0;i<index;i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteMiddle(int index) {
        if(index == 0) {
            return deleteLast();
        }
        if(index == size-1) {
            return deleteLast();
        }

        Node prev = getIndex(index-1);
        int data = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return data;

    }

    public Node find(int data) {
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void printNode() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LinkedListCore ll = new LinkedListCore();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.printNode();
        ll.insertLast(30);
        ll.insertLast(40);
        ll.printNode();
        ll.insertMiddle(100, 2);
        ll.printNode();
        ll.insertMiddle(200,1);
        ll.printNode();
        int del = ll.deleteFirst();
        System.out.println(del);
        ll.deleteFirst();
        ll.printNode();
        System.out.println(ll.deleteLast());
        ll.printNode();
        System.out.println(ll.size);
        ll.deleteMiddle(1);
        ll.printNode();
        System.out.println(ll.size);
        Node n = ll.find(10);
        System.out.println("find -> "+n.data);
    }
}
