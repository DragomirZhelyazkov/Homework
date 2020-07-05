import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Home_10_Arrays_3 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        getStudentResults();
    }
        public static void getStudentResults() {

            int[] results = new int[6];
            double sum = 0;
            int maxResult = 2;
            int minResult = 6;

            //въвеждаме матрицата -------------------------------
            for (int i = 0; i < 6; i++) {
                int result = console.nextInt();
                if (result < 2 || result > 6) {
                    System.out.println("грешно въвеждане");
                    return;
                }
                results[i] = result;
            }

            //среден успех -------------
            for (int i = 0; i < 6; i++) {
                sum = sum + results[i];
            }
            System.out.println("среден успех: " + sum / 6);

            //най-високата оценка -------------
            for (int i = 0; i < 6; i++) {
                if ( results[i] > maxResult) {
                    maxResult = results[i];
                }
            }
            System.out.println("максимакна оценка: " + maxResult);

            //най-ниската оценка -------------
            for (int i = 0; i < 6; i++) {
                if ( results[i] < minResult) {
                    minResult = results[i];
                }
            }
            System.out.println("минимална оценка: " + minResult);
        }
    }
