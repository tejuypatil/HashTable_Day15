package com.bridgelabz.hashtable;

public class MyLinkedList<K, V> {
    MyMapNode<K,V> head;
    MyMapNode<K,V> tail;

    public void push(K key,V value) {
        MyMapNode<K,V> newNode = new MyMapNode<K,V>(key,value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(K key,V value) {
        MyMapNode<K,V> newNode = new MyMapNode<K,V>(key,value);
        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void print() {
        MyMapNode<K,V> temp = head;
        while(temp != null){
            System.out.print("{ " + temp.key + "=" + temp.value + " }" + "->");
            temp = temp.next;
        }
    }
    public boolean containsKey(String key){
        MyMapNode<K,V> temp = head;
        while(temp != null){
            if(temp.key.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    public int get(String word){
        MyMapNode<K,V> temp = head;
        int count = 0;
        while(temp != null){
            if(temp.key.equals(word)){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }


    public void replace(K key, V value) {
    }
}
