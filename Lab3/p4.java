import java.util.*;

public class p4 {
    public static void main(String[] args) {
        int[][] idMarks = { { 101, 103, 105, 106, 109 }, { 67, 70, 43, 89, 56 } };
        Scanner sc = new Scanner(System.in);
        int input = -1;
        while (input != -999) {
            System.out.print("Enter ID: ");
            input = sc.nextInt();
            int index = -1;
            for (int i = 0; i < idMarks[0].length; i++) {
                if (input == idMarks[0][i]) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Invalid ID number.");
            } else {
                System.out.println("Marks = " + idMarks[1][index]);
            }
        }
        System.out.println("Program exited.");
        sc.close();
    }
}