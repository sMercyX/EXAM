public class Conditional {

    public static void main(String[] args) {

        /*
    Syntax
    if (condition | boolean ) {
        // DO or CHECK something if true do this chunk of code
    }

    if (condition | boolean) {
        // the condition (boolean) is true do this chunk of code
    } else if (condition | boolean ) {
        // check the condition true? if true do this chunk of code
    }

     */

        System.out.println(testQuiz2());
    }

    public static String testQuiz1() {
        int number = 2;
        /*
         Check if the number is positive or not

         Expected Output
         Input Data : 35
         Output: (NUMBER) is positive
         */

       if(number >=0){
           return number + " is positive";
       }
       return number + " is not positive";
    }

    public static String testQuiz2() {
        // Input between 1 - 7 return the name of that week day if non matches return "No day matches"
        int day = 21;

        if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        } else if (day == 7) {
            return "Sunday";
        }

        return "No day matches";
    }
}
