package DataStructure.Lab8.set_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TestReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(new File("data/hamlet.txt"));
		Scanner input = new Scanner(new File("src/DataStructure/Lab8/data/fit.txt"));

		while (input.hasNext()) {
			String word = input.next();
			System.out.println(word);
		}
	}
}