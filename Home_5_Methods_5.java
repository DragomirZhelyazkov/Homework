import java.util.Scanner;

public class Home_5_Methods_5 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Въведи буква от клавиатурата, ама гледай внимателно да е буква!");
        String letter = console.nextLine();
        getTypeOfLetter(letter);
    }

    private static void getTypeOfLetter(String letter) {

        switch (letter) {
            case "a" :
            case "A" :
            case "i" :
            case "I" :
            case "e" :
            case "E" :
            case "o" :
            case "O" :
            case "u" :
            case "U" :
            case "Y" :
            case "y" : System.out.println("Символът е гласна буква"); break;
            default: System.out.println("Символът не е гласна буква");
        }
    }
}
