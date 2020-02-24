package stack.demo;

import java.util.Arrays;

public class Stack {

    private String[] elems;
    private int size = 0;
    private String shortest;
    private static final int DEFAULT_CAP = 20;

    public Stack() {
        elems = new String[DEFAULT_CAP];
    }

    public void push(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Argument cant be null");
        }
        checkSize();

        if (size == 0 || s.length() <= shortest.length()) {
            shortest = s;
        }
        elems[size] = s;
        size++;
    }

    public String pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        String retVal = elems[--size];
        elems[size] = null;
        return retVal;
    }

    public String shortest() {
        return shortest;
    }

    private void checkSize() {
        if (elems.length == size) {
            elems = Arrays.copyOf(elems, 2 * size + 1);
        }
    }
}
