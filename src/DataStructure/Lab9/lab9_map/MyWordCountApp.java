package DataStructure.Lab9.lab9_map;

import java.io.*;
import java.util.*;

public class MyWordCountApp {
    // public static final String fileName = "data/hamlet.txt";
    public static final String fileName = "src/DataStructure/Lab9/data/fit.txt";
    // <word, its occurrences>
    private Map<String, Integer> map = new HashMap<String, Integer>();

    // Load data from fileName into the above map (containing <word, its occurences>)
    // using the guide given in TestReadFile.java
    public void loadData() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        System.out.println("Data: " + map);
    }

    // Returns the number of unique tokens in the file data/hamlet.txt or fit.txt
    public int countUnique() {
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }
        return count;
    }

    // Prints out the number of times each unique token appears in the file
    // data/hamlet.txt (or fit.txt)
    // In this method, we do not consider the order of tokens.
    public Map<String, Integer> printWordCounts() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.put(entry.getKey(), 1);
            }
        }
        return result;
    }

    // Prints out the number of times each unique token appears in the file
    // data/hamlet.txt (or fit.txt) according to ascending order of tokens
    // Example: An - 3, Bug - 10, ...
    public void printWordCountsAlphabet() {
        Map<String, Integer> result = new TreeMap<>(map);
        System.out.println("Print Word Counts Alphabet: " + result);
    }

    public static void main(String[] args) throws FileNotFoundException {
        MyWordCountApp myWordCountApp = new MyWordCountApp();
        myWordCountApp.loadData();
        System.out.println("Count Unique: " + myWordCountApp.countUnique());
        System.out.println("Print Word Counts:" + myWordCountApp.printWordCounts());
        myWordCountApp.printWordCountsAlphabet();
    }
}

