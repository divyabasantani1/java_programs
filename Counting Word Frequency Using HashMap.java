import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word: words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);  // Increase count
            } else {
                wordCount.put(word, 1);  // Initialize count
            }
        }

        // Display the word frequencies
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}
