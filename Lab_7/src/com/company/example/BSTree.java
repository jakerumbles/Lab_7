/*
Author: Jake Edwards
Date: 11/17/2017
Class: CSC 241-001
Professor: Dr. Ivancic
Project: Lab 7

Purpose: I named it a BSTree at the beginning but it's not actually a binary search tree.  It actually is an arithmetic
         expression tree.
 */

package com.company.example;

public class BSTree {

    private TreeNode root;

    // create empty tree
    public BSTree() {
        this.root = null;
    }

    // create tree with root item and null children
    public BSTree(char rootItem) {
        this.root = new TreeNode(rootItem, null, null);
    }

    public void setRoot(char value) {
        if (root == null) {
            root = new TreeNode(value, null, null);
        }
        else {
            root.setItem(value);
        }
    }

    public void attachLeft(char item) {
        if (!isEmpty() && root.getLeftTree() == null) {
            root.setLeftTree(new TreeNode(item, null, null));
        }
    }

    public void attachRight(char item) {
        if (!isEmpty() && root.getRightTree() == null) {
            root.setRightTree(new TreeNode(item, null, null));
        }
    }

    public void attachLeftSubtree(BSTree leftTree) {
        if (root.getLeftTree() == null) {
            root.setLeftTree(leftTree.getRoot());
        }
        else {
            System.out.println("Cannot attach to left subtree, already in use");
        }
    }

    public void attachRightSubtree(BSTree rightTree) {
        if (root.getRightTree() == null) {
            root.setRightTree(rightTree.getRoot());
        }
        else {
            System.out.println("Cannot attach to right subtree, already in use");
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public TreeNode getRoot() {
        return this.root;
    }

    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.getItem()); // root
            preorder(root.getLeftTree()); // left
            preorder(root.getRightTree()); // right
        }
    }

    public static double evaluate(TreeNode root) {
        char ch = root.getItem();


        if (ch == '+') {
            return evaluate(root.getLeftTree()) + evaluate(root.getRightTree());
        }

        else if (ch == '-') {
            return evaluate(root.getLeftTree()) - evaluate(root.getRightTree());
        }

        else if (ch == '*') {
            return evaluate(root.getLeftTree()) * evaluate(root.getRightTree());
        }

        else if (ch == '/') {
            return evaluate(root.getLeftTree()) / evaluate(root.getRightTree());
        }

        else if (ch == '^') {
            return Math.pow(evaluate(root.getLeftTree()), evaluate(root.getRightTree()));
        }

        else {
            return Character.getNumericValue(root.getItem());
        }
    }
}
