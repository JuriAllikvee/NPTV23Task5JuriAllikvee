import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] jaggedArray = {
                new int[3],
                new int[5],
                new int[7],
                new int[8],
                new int[9]
        };

        Random random = new Random();

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = 50 + random.nextInt(51);
            }
        }

        System.out.println("Несортированный массив:");
        for (int[] row : jaggedArray) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row : jaggedArray) {
            Arrays.sort(row);
        }

        System.out.println("Сортированный массив:");
        for (int[] row : jaggedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}