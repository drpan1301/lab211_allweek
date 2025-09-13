package CountWord;

import java.util.HashMap;
import java.util.Map;

public class CountingWord {

	public static Map<String, Integer> countWords(String input) {
		Map<String, Integer> wordCount = new HashMap<>();
		String[] words = input.trim().split("\\s+");
		for (String word : words) {
			if (!word.isEmpty()) {
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
			}
		}
		return wordCount;
	}

	public static Map<Character, Integer> countCharacters(String input) {
		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : input.toCharArray()) {
			if (!Character.isWhitespace(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}
		return charCount;
	}
}