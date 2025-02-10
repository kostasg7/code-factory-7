package gr.aueb.cf.ch19.exercises;

import com.sun.jdi.Value;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Exe1 {

    public static void main(String[] args) {

        String inFilePath = "C:/tmp/f1.txt";
        LinkedList<Character> charList = new LinkedList<>();

        try (FileReader reader = new FileReader(inFilePath)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                charList.add((char) ch);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Map<Character, Integer> frequencyMap = new TreeMap<>();
        for (Character c : charList) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);;
        }

        System.out.println("Ταξινόμηση κατά χαρακτήρα (ascending):");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Ταξινόμηση κατά ποσοστό (descending)
        int totalCharacters = charList.size();
        Map<Character, Double> percentageMap = frequencyMap.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> (e.getValue() / (double) totalCharacters) * 100
                ));
        System.out.println("Ταξινόμηση κατά ποσοστό (descending):");
        percentageMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Double>comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + ", " + entry.getValue() + "%"));
        ListIterator<Character> it = charList.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
