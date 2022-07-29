package com.bridgelabz.hashtable;

public class INode<T> {
    T data;
    INode<T> next;

    INode<T> prev;

    public INode() {
    }

    public INode(T data) {
        this.data = data;
    }
}
