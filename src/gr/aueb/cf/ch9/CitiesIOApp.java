package gr.aueb.cf.ch9;

import java.io.File;

public class CitiesIOApp {

    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:/tmp/io");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in mkdir");
                System.exit(1);
            }
        }
    }
}
