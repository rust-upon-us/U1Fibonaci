import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        // Create a boolean variable to handle the loop's execution
        boolean stop = false;
        // Create an array object to be used inside the do-while loop
        int[] fibonaci = null;
        // Create an object of the class scanner to capture the parameter required to execute the application
        Scanner inputListener = new Scanner(System.in);
        // Create an int variable to capture the user's input
        int numbers = 0;
        // Show the welcome message to request the input of a numeric value to the user
        System.out.println("Please introduce the amount of numbers to be shown from the fibonacci list");
        do{
            if (numbers <= 0){
                // Capture the user input inside a variable
                numbers = inputListener.nextInt();
                if (numbers <= 0){
                    System.out.println("please introduce a number greater than 0");
                }
            }else {
                // End the loop
                stop = true;
                // Obtain the fibonaci list
                fibonaci = fibonaciCalculator(numbers);
                // Check the results
                if (fibonaci != null){
                    System.out.println(Arrays.toString(fibonaci));
                }else {
                    System.out.println("Something went wrong wile creating the fibbonaci list");
                }
            }
        }while (!stop);
        // The loop has ended, and we can assume we were successful in the creation of the fibbonaci's list but to be sure we check it's value
        if (fibonaci != null){
            System.out.println(Arrays.toString(fibonaci));
        }else {
            System.out.println("Something went wrong wile creating the fibbonaci list");
        }
    }
    public static int[] fibonaciCalculator(int amount){
        // Create a boolean variable to handle the loop's execution
        boolean stop = amount<=0;
        // Create an int variable to keep track of the current iteration
        int loop = 0;
        // Create an array object to be used inside the do-while loop
        int[] fibonaci = null;
        // Start the loop
        while (!stop){
            switch (loop){
                case 0:
                    // on the first iteration create the array to be returned to the user
                    fibonaci = new int[amount];
                    // then add the first value to the list
                    fibonaci[loop] = 0;
                    break;
                case 1:
                    // the second iteration is also special because we can't work with only the first parameter soo we add by hand the next value.
                    fibonaci[loop] = 1;
                    break;
                default:
                    // Proceed to the addition by recovering the 2 previous values
                    fibonaci[loop] = fibonaci[loop-2] + fibonaci[loop-1];
                    break;
            }
            // Increase the value of the variable that keeps track of the current iteration
            loop++;
            // Check if it's needed to end the loop before the next iteration
            stop = loop == amount;
        }
        // Loop ended return the created value
        return fibonaci;
    }
}
