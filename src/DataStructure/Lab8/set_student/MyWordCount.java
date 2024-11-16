package DataStructure.Lab8.set_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MyWordCount {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "src/DataStructure/Lab8/data/fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public List<WordCount> getWordCounts() {
		List<WordCount> re = new ArrayList<WordCount>();
		for(String word : this.words) {
			if(!updateWordCount(re, word)) {
				re.add(new WordCount(word, 1));
			}
		}
		return re;
	}
	
	private boolean updateWordCount(List<WordCount> re, String word) {
		for(WordCount wc : re) {
			if(wc.getWord().equals(word)) {
				wc.setCount(wc.getCount()+1);
				return true;
			}
		}
		return false;
	}

//	public Map<String, Integer> getWordCounts1() {
//		Map<String, Integer> re = new HashMap<>();
//		for (String word : words) {
//			re.put(word, re.getOrDefault(word, 0) + 1);
//		}
//		return re;
//	}


	// Returns the words that their appearance are 1, do not consider duplidated
	// words
	public Set<String> getUniqueWords() {
		Set<String> result = new HashSet<>();
		List<WordCount> wordCounts = this.getWordCounts();
		for (WordCount word : wordCounts){
			if(word.getCount() == 1){
				result.add(word.getWord());
			}
		}
		return result;
	}

	// Returns the words in the text file, duplicated words appear once in the
	// result
	public Set<String> getDistinctWords() {
        return new HashSet<>(this.words);
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public Set<WordCount> printWordCounts() {
		Comparator<WordCount> countAscendingComparator = new Comparator<WordCount>() {
			@Override
			public int compare(WordCount o1, WordCount o2) {
				int byOcc = o1.getCount() - o2.getCount();
				if(byOcc == 0){
					return o1.getWord().compareTo(o2.getWord());
				}
                return byOcc;
            }
		};
		TreeSet<WordCount> result = new TreeSet<>(countAscendingComparator);
        result.addAll(this.getWordCounts());
		return result;
    }

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according descending order of occurences
	// Example: Bug - 10, An - 3, Nam - 2.
	public Set<WordCount> exportWordCountsByOccurence() {
		Comparator<WordCount> countDescendingComparator = new Comparator<WordCount>() {
			@Override
			public int compare(WordCount o1, WordCount o2) {
				int byOcc = o2.getCount() - o1.getCount();
				if(byOcc == 0){
					return o2.getWord().compareTo(o1.getWord());
				}
				return byOcc;
			}
		};
		TreeSet<WordCount> result = new TreeSet<>(countDescendingComparator);
		result.addAll(this.getWordCounts());
		return result;
	}

	// delete words beginning with the given pattern (i.e., delete words begin with
	// 'A' letter
	public Set<String> filterWords(String pattern) {
		Set<String> result = new HashSet<>();
		for(String word : words){
			if(!word.substring(0,1).equals(pattern)){
				result.add(word);
			}
		}
		return result;
	}
	public static void main(String[] args){
		MyWordCount myWordCount = new MyWordCount();
		System.out.println(myWordCount.getUniqueWords());
		System.out.println(myWordCount.getDistinctWords());
		System.out.println(myWordCount.printWordCounts());
		System.out.println(myWordCount.exportWordCountsByOccurence());
		System.out.println(myWordCount.filterWords("D"));
	}
}
