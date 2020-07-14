import java.util.Scanner;

public class Home_12_Strings_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        countWords();
    }
    private static void countWords() {
        String inputText = scanner.nextLine();
        String[] words = inputText.split(" ");
        int sumWords = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].charAt(words[i].length() -1) == 'y'|| words[i].charAt(words[i].length() -1) == 'z') {
                sumWords++;
            }
        }
        System.out.println(sumWords);
    }
}
