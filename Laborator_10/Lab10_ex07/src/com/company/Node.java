package com.company;

public class Node {

    private String data;
    private Node next;
    private Node previous;
    static private Node first;
    static private Node last;
    static int size = 0;

    public Node(String data, Node next, Node previous, Node first) {
        this.data = data;
        this.next = next;
        this.previous = previous;
        Node.first = first;
        size++;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }


    public static void setFirst(Node first) {
        Node.first = first;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void setLast(Node last) {
        Node.last = last;
    }


    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }


    public static Node getFirst() {
        return first;
    }

    public static Node getLast() {
        return last;
    }

    public static int getSize() {
        return size;
    }

}
