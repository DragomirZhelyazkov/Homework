import java.util.Scanner;

public class Home_12_Strings_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printRepeatLetters();
    }
    private static void printRepeatLetters() {
        String inputText = scanner.nextLine();

        int length = inputText.length() / 2;
        String repeatText = "";
        String repeatTextMirror = "";
        for (int i = 0; i < length; i++) {
            if(inputText.charAt(i) == inputText.charAt((inputText.length() - 1) - i)) {
            repeatText = repeatText + inputText.charAt(i);
            repeatTextMirror = repeatTextMirror + inputText.charAt((inputText.length() - 1) - i);
            }
        }
        System.out.println("Mirror leters: " + repeatText + ", " + repeatTextMirror);
    }
}
