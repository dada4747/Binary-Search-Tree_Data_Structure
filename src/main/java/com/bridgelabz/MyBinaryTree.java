package com.bridgelabz;

public class MyBinaryTree<K extends Comparable<K>> {
    private BinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }


}