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
    @Test
    public void givenThreeNumbers_whenAddedToTree_ShouldReturnSizeThree(){
        MyBinaryTree<Integer> customBinaryTree = new MyBinaryTree<>();
        customBinaryTree.add(56);
        customBinaryTree.add(30);
        customBinaryTree.add(70);
        customBinaryTree.add(22);
        customBinaryTree.add(40);
        customBinaryTree.add(60);
        customBinaryTree.add(95);
        customBinaryTree.add(11);
        customBinaryTree.add(65);
        customBinaryTree.add(3);
        customBinaryTree.add(16);
        customBinaryTree.add(63);
        customBinaryTree.add(67);

        int size = customBinaryTree.getSize();
        Assertions.assertEquals(13,size);
    }
}
