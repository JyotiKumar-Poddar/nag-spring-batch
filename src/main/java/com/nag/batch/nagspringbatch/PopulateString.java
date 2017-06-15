package com.nag.batch.nagspringbatch;

import java.util.Stack;

/**
 * Created by jyotipoddar on 6/15/2017.
 */
public class PopulateString {
    final static Stack<String> stack = new Stack<>();

    public static void populateString() {
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.push("7");
        stack.push("8");
    }

    public static String getStringFromStack() {

        if (!stack.isEmpty())
            return stack.pop();
        else
            return null;
    }

}
