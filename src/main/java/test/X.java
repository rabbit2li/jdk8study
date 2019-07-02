package test;

import java.io.IOException;

public class X {

    public static void main(String[] args) throws IOException {
        T obj = new T();
        obj.printT();
    }
}

class T {
    public void printT() throws IOException {
        throw new IOException();
    }
}
