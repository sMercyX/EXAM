import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int[] arrayOfZeroTwo = new int[10];
        for (int i = 0; i < arrayOfZeroTwo.length; i++) {
            arrayOfZeroTwo[i] = new Random().nextInt(2);
        }
        System.out.println(Arrays.toString(arrayOfZeroTwo));

        testQuiz1();
        System.out.println(testQuiz2(4653));
        System.out.println (testQuiz3(arrayOfZeroTwo));
        System.out.println (Arrays.toString(testQuiz4(arrayOfZeroTwo)));

//        testQuiz1();
//        System.out.println(testQuiz2(156784));
//
//
//        System.out.println(Arrays.toString(arrayOfZeroTwo));
//        System.out.println(testQuiz3(arrayOfZeroTwo));
//        System.out.println(Arrays.toString(testQuiz4(arrayOfZeroTwo)));


    }


    public static void testArray() {
        /*
        What is Array?
        Array is the variable that contain set of data [String, int, double, boolean]
        Ex.
        Array of int that contain number 1, 2, 3, 4
        Array of String that contain cars
        */

        //Sample Array
        int[] number = {1, 2, 3, 4};
        String[] cars = {"Ford Ranger", "Mitsubishi", "Subaru"};

        //Sample empty array
        int[] number2 = new int[4];
        String[] cars2 = new String[3];

        // Try Print it out!
//        System.out.println(number);

        // What is index?
//        System.out.println(number[0]);


        // You can change your values through index
//        System.out.println("This is your old values : " + number2[0]);
        number2[0] = 1;
//        System.out.println("The new value you assign : " + number2[0]);

    }

    public static void testQuiz1() {
        /*
        A)
        A.1 Build an empty arrays called pet with the size of 3
        A.2 Assign the value of your array with your 3 favorite pets
        A.3 Print out the values
        */

        String[] pet = new String[3];
        pet[0] = "Dog";
        pet[1] = "Cat";
        pet[2] = "Bird";


        System.out.println(Arrays.toString(pet));


//        String[] pet = new String[3];
//        pet[0] = "Dog";
//        pet[1] = "cat";
//        pet[2] = "Batman";
//
//
//        for (int i = 0; i < pet.length; i++) {
//            System.out.println(pet[i]);
//        }
    }

    public static int testQuiz2(int item) {
        /*
         B) Write the program that return that values index, if none matches return 999
         Expected Output
         item = 6512
         Output: 1
         item = 314141414
         Output: 999
         */

        int[] arr1 = {6513, 6521, 4653, 1243, 6756, 8975, 2144};

        for (int i = 0; i < arr1.length; i++)
            if (item == arr1[i]){
                return i;
            }
        return 999;


//        int[] arr1 = {6513, 6521, 4653, 1243, 6756, 8975, 2144};
//        for (int i = 0; i < arr1.length; i++) {
//            if(item == arr1[i]){
//                return i;
//            }
//        }
//        return 999;
    }

    public static int testQuiz3(int[] arrayOfZeroOne) {
        /*
         Write program that return count of all 1 in an already created array
         Expected Output
         [0,0,1,1,0,0,1,1,0,0]
         Output: 4
         */

        int count = 0;

        for (int i = 0; i < arrayOfZeroOne.length; i++) {
            if(arrayOfZeroOne[i] == 1){
                count += 1;
            }
        }
        return count;


//        int countNum = 0;
//
//        for (int i = 0; i < arrayOfZeroOne.length; i++) {
//            if(arrayOfZeroOne[i] == 1){
//                countNum += 1;
//            }
//        }
//
//        return countNum;
    }

    public static int[] testQuiz4(int[] arrayOfZeroOne) {
        /*
         Write program that return int[] that contain only 1 in an already created array
         Expected Output
         [0,0,1,1,0,0,1,1,0,0]
         Output: [1,1,1,1]
         */
        int check = 0;

        for (int i = 0; i < arrayOfZeroOne.length; i++) {
            if (arrayOfZeroOne[i] == 1){
                check += 1;
            }
        }
        int[] arrayOfOne = new int[check];
        for (int j = 0; j < arrayOfOne.length; j++) {
            arrayOfOne[j] = 1;
        }
        return arrayOfOne;


//        int countNum = 0;
//        for (int i = 0; i < arrayOfZeroOne.length; i++) {
//            if(arrayOfZeroOne[i] == 1) {
//                countNum += 1;
//            }
//        }
//        int[] arrayOfOne = new int[countNum];
//
//        for (int j = 0; j < countNum; j++) {
//            arrayOfOne[j] = 1;
//        }
//        return arrayOfOne;
    }
}
