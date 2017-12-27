/*
Author: Jake Edwards
Date: 11/17/2017
Class: CSC 241-001
Professor: Dr. Ivancic
Project: Lab 7

Purpose: This program accepts a file containing valid postfix expressions and creates an arithmetic expression tree from them.
         It then evaluates the expression recursively with the tree and finally traverses the tree in preorder, printing
         the expression in postfix form.
 */

package com.company.example;

import java.io.File;
import java.util.Scanner;

public class p7 {

    public static void main(String[] args) throws Exception{

        // File path for compilation on CS server
        //String fileName = "/home/courses/cs2411/ProgramFiles/" + args[0];
        String fileName = "C:\\Users\\edwar\\Documents\\Data Structures\\Lab_7\\assets\\p7.dat";

        File file = new File(fileName);
        Scanner fInput = new Scanner(file);

        Stack stack = new Stack();


        while (fInput.hasNext()) {
            String expression = fInput.next();
            char ch;

            // this assumes valid file input i.e. only numbers and operators
            for (int i = 0; i < expression.length(); i++) {
                ch = expression.charAt(i);

                // ch is an operator
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                    BSTree tree = new BSTree(ch); // create new tree from operand
                    tree.attachRightSubtree(stack.pop()); // attach right subtree
                    tree.attachLeftSubtree(stack.pop()); // attach left subtree

                    stack.push(tree);
                }

                // ch is a number
                else {
                    BSTree tree = new BSTree(ch);
                    stack.push(tree);
                }

            }

            BSTree tree = stack.pop();

            System.out.println("Postfix expression: " + expression);
            System.out.println("Result: " + BSTree.evaluate(tree.getRoot()));
            System.out.print("Prefix: ");
            tree.preorder(tree.getRoot());

            System.out.println("\n\n\n");
        }
    }
}
