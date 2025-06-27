
    import java.util.Scanner;

public class homewor5354k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        
        sentence = sentence.trim();

        
        String[] words = sentence.split("\\s+"); 
        int wordCount = words.length;

        
        String reversed = new StringBuilder(sentence).reverse().toString();

        
        String smallestWord = words[0];
        for (String word : words) {
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        
        System.out.println("\n--- Analysis Results ---");
        System.out.println("Total number of words: " + wordCount);
        System.out.println("Reversed sentence: " + reversed);
        System.out.println("Smallest word: \"" + smallestWord + "\" (Length: " + smallestWord.length() + ")");
    }
}

