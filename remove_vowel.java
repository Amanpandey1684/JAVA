import java.util.Scanner;

public class remove_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            System.out.println("String with vowels removed: " + removeVowels(inputString));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static String removeVowels(String inputString) {
        try {
            StringBuilder result = new StringBuilder();
            String vowels = "aeiouAEIOU";

            for (char ch : inputString.toCharArray()) {
                if (vowels.indexOf(ch) == -1) {
                    result.append(ch);
                }
            }

            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error occurred while removing vowels: " + e.getMessage());
        }
    }
}
