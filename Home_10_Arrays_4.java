import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Home_10_Arrays_4 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int num = getNumberStudents();
        String[] studySubjects = new String[6];
        int[][] results = new int[num][6];
        String[] names = new String[num];
        inputStudentsResults(num, names, results, studySubjects);

        for (int i = 0; i < num; i++) {
            getStudentResults(i, results, names);
        }
    }

    public static int getNumberStudents() {
        System.out.println("Брой студенти: ");
        int numberStudents = console.nextInt();
        return numberStudents;
    }

    public static void inputStudentsResults(int numStudents, String[] names, int[][] results, String[] studySubjects) {
        System.out.println("Въведи имена");
        //въвеждаме имената -------------------------------
        for (int i = 0; i < numStudents; i++) {
            String name = console.next();
            names[i] = name;
        }
        //въвеждаме предметите -------------------------------
        for (int i = 0; i < 6; i++) {
            System.out.println("Въведи предмети");
            String subject = console.next();
            studySubjects[i] = subject;
        }
        //въвеждаме оценките -------------------------------
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Въведи оценки от 2 до 6 на студент " + i);
            for (int j = 0; j < 6; j++) {
                int result = console.nextInt();
                if (result < 2 || result > 6) {
                    System.out.println("грешно въвеждане");
                    return;
                }
                results[i][j] = result;
            }
        }
    }

    public static void getStudentResults(int studentIndex, int[][] results, String[] names) {
        double sum = 0;
        int maxResult = 2;
        int minResult = 6;

        System.out.println(names[studentIndex]);
        //среден успех -------------
        for (int i = 0; i < 6; i++) {
            sum = sum + results[studentIndex][i];
        }
        System.out.println("среден успех: " + sum / 6);


        //най-високата оценка -------------
        for (int i = 0; i < 6; i++) {
            if (results[studentIndex][i] > maxResult) {
                maxResult = results[studentIndex][i];
            }
        }
        System.out.println("максимакна оценка: " + maxResult);

        //най-ниската оценка -------------
        for (int i = 0; i < 6; i++) {
            if (results[studentIndex][i] < minResult) {
                minResult = results[studentIndex][i];
            }
        }
        System.out.println("минимална оценка: " + minResult);
    }
}
