package DataStructure.Lab9.lab9_map;

import java.util.*;

public class TextAnalyzer {
	// <word, its positions>
	private Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

	// load words in the text file given by fileName and store into map by using add
	// method in Task 2.1.
	// Using BufferedReader referred in file TextFileUtils.java
	public void load(String fileName) {
		// TODO
	}
	// In the following method, if the word is not in the map, then adding that word
	// to the map containing the position of the word in the file. If the word is
	// already in the map, then its word position is added to the list of word
	// positions for this word.
	// Remember to negate the word position if the word is at the end of a line in
	// the text file

	public void add(String word, int position) {
		ArrayList<Integer> values = map.getOrDefault(word, new ArrayList<>());
		values.add(position);
		map.put(word, values);
	}

	// This method should display the words of the text file along with the
	// positions of each word, one word per line, in alphabetical order
	public void displayWords() {
		Map treeMap = new TreeMap(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		treeMap.putAll(map);
	}

	// This method will display the content of the text file stored in the map
	public void displayText() {
		// TODO
	}

	// This method will return the word that occurs most frequently in the text file
	public String mostFrequentWord() {
		// TODO
		return null;
	}
	public static void main(String[] args) {
		TextAnalyzer textAnalyzer = new TextAnalyzer();
		textAnalyzer.displayWords();
	}
}
