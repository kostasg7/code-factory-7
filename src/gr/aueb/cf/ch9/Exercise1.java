package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Exercise1 {

    public static void main(String[] args){
        String inFilePath = "C:/tmp/Exercise1.txt";
        String outFilePath = "C:/tmp/execOutput.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8) ){

            boolean isFirstLine = true;
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                tokens = line.split(",+\\s*");
                printFormated(ps, tokens);
                printFormated(System.out, tokens);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printFormated(PrintStream ps, String[] tokens) {
        ps.printf("{ Location: '%s', Latitude: '%s', Longitude: '%s' }\n", tokens[0], tokens[1], tokens[2]);
    }
}
