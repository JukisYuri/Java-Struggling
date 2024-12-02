package DataStructure.Lab9.lab9_map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextAnalyzer {
	// <word, its positions>
	private Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

	// load words in the text file given by fileName and store into map by using add
	// method in Task 2.1.
	// Using BufferedReader referred in file TextFileUtils.java
	public void load(String fileName){
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String readLine;
			int totalNumberOfWordsRead = 0;
			while ((readLine = br.readLine()) != null) {
				String[] words = readLine.split("\\s+");
				for (int i = 0; i < words.length; i++) {
					int currentPosition = totalNumberOfWordsRead + i + 1;
					if(i == words.length - 1){
						add(words[i], -currentPosition);
					} else {
						add(words[i], currentPosition);
					}
				}
				totalNumberOfWordsRead += words.length;
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println(map);
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
		Set<String> sortedWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER); // Chuyển tất cả các từ trong map thành chữ thường và sắp xếp theo thứ tự alphabet
		sortedWords.addAll(map.keySet());
		for (String word : sortedWords) {
			ArrayList<Integer> values = map.get(word);
				System.out.print(word + ": ");
				for (Integer position : values) {
					System.out.print(position + " ");
				}
				System.out.println();
		}
		System.out.println("------------");
	}

	// This method will display the content of the text file stored in the map
	public void displayText() {
		for(String word : map.keySet()){
			ArrayList<Integer> values = map.get(word);
			System.out.print(word + ": ");
			for (Integer position : values) {
				System.out.print(position + " ");
			}
			System.out.println();
		}
		System.out.println("------------");
	}

	// This method will return the word that occurs most frequently in the text file
	public String mostFrequentWord() {
		String result = "";
		int maxCount = 0;
		for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			int count = entry.getValue().size();
			if (count > maxCount) {
				maxCount = count;
				result = entry.getKey();
			}
		}
		return result;
	}


	public static void main(String[] args) throws IOException {
		TextAnalyzer textAnalyzer = new TextAnalyzer();
		textAnalyzer.load("src/DataStructure/Lab9/data/short.txt");
		System.out.println("------------");
		textAnalyzer.displayWords();
		textAnalyzer.displayText();
		System.out.println("Most Frequent Word: " + textAnalyzer.mostFrequentWord());
	}
}
