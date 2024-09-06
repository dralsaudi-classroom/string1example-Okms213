package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = 0;
	   str = new char[80];
	}
	public void append(char c) {
        str[size++] = c;
    }
    public char remove() {
        return str[--size];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size;
    }
    public void makeEmpty()
    {
        size = 0;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
	if(size!= s.size)
		return false;
        for(int i=0;i<size;i++)
		if(str[i] != s.str[i])
			return false;
	return true;
    }
    public void reverse() {
        int halfLen = size / 2;
	for(int i=0;i<halfLen;i++){
		char temp = str[i];
		str[i] = str[size - i - 1];
		str[size - i - 1] = temp;
    }
}
