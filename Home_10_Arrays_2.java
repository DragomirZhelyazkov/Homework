import java.util.Scanner;

public class Home_10_Arrays_2 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int[ ][ ] intMatrix = new int[6][6];
        int sum = 0;

        //въвеждаме матрицата -------------------------------
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int number = console.nextInt();
                intMatrix[i][j] = number;
            }
        }
        //извеждаме матрицата на конзолата -------------
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(intMatrix[i][j]);
            }
            System.out.print("\n");
        }
        //извеждаме сумите в колони 1,3,5 от матрицата на конзолата
        for (int i = 0; i < 6; i++) {
            int columnSum = 0;
            if ( (i + 2) % 2 == 0) {
                for (int j = 0; j < 6; j++) {
                    columnSum = columnSum + intMatrix[j][i];
                }
                System.out.println("column" + i + "Sum" + " = " + columnSum);
            }

        }

    }
}
