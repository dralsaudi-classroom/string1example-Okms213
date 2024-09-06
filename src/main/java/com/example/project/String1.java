package com.example.project;
public class String1 {
    private char[] str;
    private int size;

    public String1() {
        size = -1;
        str = new char[80];
    }

    public void append(char c) {
        str[++size] = c;
    }

    public char remove() {
        return str[size--];
    }

    public char getChar(int i) {
        return str[i];
    }

    public int length() {
        return size+1;
    }

    public void makeEmpty() {
        size = -1;
    }

    public void print(){
        for(int i=0;i<length();i++)
            System.out.print(str[i]);
    }

    public void concat(String1 s) {
        for (int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }

    public boolean equal(String1 s) {
        if (length() != s.length())
            return false;
        for (int i = 0; i < length(); i++)
            if (str[i] != s.str[i])
                return false;
        return true;
    }

    public void reverse() {
        int halfLen = length() / 2;
        for (int i = 0; i < halfLen; i++) {
            char temp = str[i];
            str[i] = str[length() - i - 1];
            str[length() - i - 1] = temp;
        }
    }
}
