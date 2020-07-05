import java.util.Scanner;

public class Home_10_Arrays_1 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int[ ][ ] intMatrix = new int[4][4];
        int[ ] sumsRows = new int[4];
        int[ ] sumsColumns = new int[4];
        int sum = 0;

        //въвеждаме матрицата -------------------------------
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = console.nextInt();
                if (i == 0) {
                    sum = sum + number;
                }
                intMatrix[i][j] = number;
            }
        }
        //извеждаме матрицата на конзолата -------------
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(intMatrix[i][j]);
            }
            System.out.print("\n");
        }
        //сумиране на редовете-----------------------
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum = rowSum + intMatrix[i][j];
            }
            System.out.println("rowSum" + i + ":" + rowSum);
                sumsRows[i] = rowSum;
        }
        //сумиране на колоните-----------------------
        for (int i = 0; i < 4; i++) {
            int columnSum = 0;
            for (int j = 0; j < 4; j++) {
                columnSum = columnSum + intMatrix[j][i];
            }
            System.out.println("columnSum" + i + ":" + columnSum);
            sumsColumns[i] = columnSum;
        }
        //сумиране на диагоналите-----------------------
        int diagonalFirst = 0;
        for (int i = 0; i < 4; i++) {
            diagonalFirst = diagonalFirst + intMatrix[i][i]; }

        int diagonalSecond = 0;
        for (int i = 3; i >= 0; i--) {
            diagonalSecond = diagonalSecond + intMatrix[i][i]; }

        System.out.println("diagonalFirst" + ":" + diagonalFirst);
        System.out.println("diagonalSecond" + ":" + diagonalSecond);

        //проверка на сумите-----------------------
        for (int i = 0; i < 4; i++) {
            if (sum != sumsRows[i] || sum != sumsColumns[i] || sum != diagonalFirst || sum != diagonalSecond) {
                System.out.println("Квадрата не е магически");
                break;
            } else if (i == 3) {
                System.out.println("Квадрата е магически");
            }
        }

    }
}

