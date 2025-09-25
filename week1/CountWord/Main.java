package CountWord;

import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your content: ");
        String input = scanner.nextLine();

        Map<String, Integer> wordCount = CountingWord.countWords(input);
        System.out.println(wordCount);

        Map<Character, Integer> charCount = CountingWord.countCharacters(input);
        System.out.println(charCount);
   }
    
}