import java.util.Arrays;
import java.util.Random;

public class Loops {

    public static void main(String[] args) {
//         Write the program that print all values in array
//        int[] number = { 123,456,789,321,543,765,987 };
//        for (int i = 0; i < number.length; i++) {
//            System.out.println(number[i]);
//        }
//
//        int x = new Random().nextInt( 101); //เริ่มต้นด้วย 0
//        int y = new Random().nextInt( (1000 - 600) + 1) + 600;
//        random[i] = (int)(Math.random() * (50-1))+1;
//        random[i] = (int)(Math.random() * (100-50))+50;
//
//        System.out.println(x);
//        System.out.println(y);

        int[] randomSet = new int[10];
        for (int i = 0; i < randomSet.length; i++) {
            randomSet[i] = new Random().nextInt(randomSet.length);
        }
        System.out.println(Arrays.toString(randomSet)); // Array of random integer
        System.out.println(testQuiz2(randomSet));
//        testQuiz2(randomSet);
    }

    public static void testQuiz1() {
        // Write program that return number 1 - 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static int testQuiz2(int[] randomSet) {
        /*
         Write the program that read sets of integers, then return the sum of even integer
         Expected Output
         [2,3,5,1,6]
         Output: 8
         */
        int x = 0;
        for (int i = 0; i < randomSet.length; i++) {
            if (randomSet[i] % 2 == 0) {
                return x += randomSet[i];
            }
        }
        return x;
    }
}
