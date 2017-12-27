/*
Author: Jake Edwards
Date: 11/17/2017
Class: CSC 241-001
Professor: Dr. Ivancic
Project: Lab 7

Purpose: This class is a basic stack.
 */

package com.company.example;

public class Stack {

    private StackNode top;

    public Stack() {
        this.top = null;
    }

    public Stack(BSTree tree) {
        StackNode node = new StackNode(tree, null);
        top = node;
    }

    public void push(BSTree tree) {
        StackNode node = new StackNode(tree, null);

        if (top == null) {
            top = node;
        }
        else {
            StackNode temp = top;
            top = node;
            top.setNext(temp);
        }
    }

    public BSTree pop() {
        StackNode temp = top;
        top = top.getNext();

        return temp.getTree();
    }

    public boolean isEmpty() {
        if (top == null)
            return true;
        else
            return false;
    }
}
