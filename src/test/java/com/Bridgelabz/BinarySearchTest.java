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
    @Test
    public void givenNumber_WhenSearched_ShouldBeFoundInBST() {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);
        int key = binaryTree.search(63);
        Assertions.assertEquals(63, key);
    }
}

