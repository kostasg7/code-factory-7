package gr.aueb.cf.ch9;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input file path: ");
        String inFilePath = scanner.nextLine();

        String outFilePath = "C:/tmp/dummyReplace_" + UUID.randomUUID().toString().replace(":", "_") + ".pdf";
        int b;
        byte[] buffer = new byte[8192];

        File inputFile = new File(inFilePath);
        File outputFile = new File(outFilePath);

        String fullInputName = inputFile.getName();
        String fullOutputName = outputFile.getName();

        String absoluteInPath = inputFile.getAbsolutePath();
        String absoluteOutPath = outputFile.getAbsolutePath();

        System.out.println("Name of input file: " + fullInputName);
        System.out.println("Name of output file: " + fullOutputName);
        System.out.println("Absolute path of input file: " + absoluteInPath);
        System.out.println("Absolute path of output file: " + absoluteOutPath);

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))){


            while ((b = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, b);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}