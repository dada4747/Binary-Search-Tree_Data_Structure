package com.Bridgelabz;

import com.bridgelabz.MyBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void given3Numbers_WhenAddedToBST_ShouldReturnSize3() {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int size = binaryTree.getSize();
        Assertions.assertEquals(3, size);
    }
}
