package com.bridgelabz.hashtable;
public class HashTable {
    public static void main(String[] args) {
        String sentence = "To be or not to be";

        String[] words = sentence.split(" ");


        MyHashTable<String, Integer> hashTable = new MyHashTable<>();

       for (String word : words) {
            if (hashTable.containsKey(word))
                hashTable.put(word, hashTable.get(word) + 1);

            else
                hashTable.put(word, 1);
        }
        hashTable.print();
    }
}