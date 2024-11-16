package DataStructure.Lab8.set_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
	public static List<String> loadWords(String fileName) throws FileNotFoundException {
		List<String> re = new ArrayList<String>();
		Scanner input = new Scanner(new File(fileName));

		while (input.hasNext()) {
			String word = input.next();
			re.add(word);
		}
		return re;
	}
}
