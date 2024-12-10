package gr.aueb.cf.ch9;

import java.io.*;

public class IOAppend {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/TestAppend1.txt", true));
        PrintWriter pw = new PrintWriter(new FileOutputStream("C:/tmp/TestAppend2.txt", true));

        ps.println("Hello from PrintStream");
        pw.println("Hello from PrintWriter");

        ps.close();
        pw.close();
    }
}
