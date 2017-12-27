/*
Author: Jake Edwards
Date: 11/17/2017
Class: CSC 241-001
Professor: Dr. Ivancic
Project: Lab 7

Purpose: This is a node class to be used with a tree
 */

package com.company.example;

public class TreeNode {

    // class variables
    private char item;
    private TreeNode leftTree;
    private TreeNode rightTree;

    // constructors
    TreeNode(char item) {
        this.item = item;
        this.leftTree = null;
        this.rightTree = null;
    }

    TreeNode(char item, TreeNode leftTree, TreeNode rightTree) {
        this.item = item;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    // getters and setters
    public char getItem() {
        return item;
    }

    public void setItem(char item) {
        this.item = item;
    }

    public TreeNode getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(TreeNode leftTree) {
        this.leftTree = leftTree;
    }

    public TreeNode getRightTree() {
        return rightTree;
    }

    public void setRightTree(TreeNode rightTree) {
        this.rightTree = rightTree;
    }
}
