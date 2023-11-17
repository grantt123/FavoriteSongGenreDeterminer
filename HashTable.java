//*********************************************
// Title: Favorite Song Genre Determiner
// Name: Grant Tran
// Course Section: CMIS202-ONL1 (Seidel) Fall 2023
// File: HashTable.java
// Description: This file is the hashtable is implemented and is used in the Interface file
//*********************************************

import java.util.LinkedList;

public class HashTable {

    private LinkedList<String>[] table;
    private static final int TABLE_SIZE = 10; 
    
    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void put(String key) {
        int hash = calculateHash(key);
        table[hash].add(key);
    }

    public boolean contains(String key) {
        int hash = calculateHash(key);
        return table[hash].contains(key);
    }

    private int calculateHash(String key) {
        return key.length() % TABLE_SIZE;
    }
}
