/*
Author: Jake Edwards
Date: 11/17/2017
Class: CSC 241-001
Professor: Dr. Ivancic
Project: Lab 7

Purpose: This is a node class to be used with the Stack.java class.  It is designed to work with objects of type BSTree.
 */

package com.company.example;

public class StackNode {

    private BSTree tree;
    private StackNode next;

    // constructor
    public StackNode(BSTree tree, StackNode next) {
        this.tree = tree;
        this.next = next;
    }

    public void setTree(BSTree tree) {
        this.tree = tree;
    }

    public BSTree getTree() {
        return this.tree;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public StackNode getNext() {
        return this.next;
    }
}
