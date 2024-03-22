import java.awt.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //1. Create a method that only prints odd numbers from 10 to 1
    public static void printALlOddNumbers() {
        int x = 10;
        while (x >= 1) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x--;
        }
    }

    //2.
    public static int returnsTheSum(int[] numbersToSum){
        int addition = 0;
        for(int value : numbersToSum){
            addition += value;
        }
        return addition;
    }

    //3.
    public static int returnsTheAverage(int[] numbersToAverage){
        int summed = returnsTheSum(numbersToAverage);
        return summed / numbersToAverage.length;
    }

    //4.
    public static void randomNumberGenerator(){
        Random output = new Random(); //create a new random value
        int randomInt = output.nextInt(1, 7); //new int = our random value (origin, bounds)
        System.out.println(randomInt); //sout our new int
    }
    //5.
    public static void sumOfAllEvenNumbers(int[] evenNumArrayCalc){
        int summed = 0; //new int to make equal to out even numbers
        for(int checkerForEven : evenNumArrayCalc){
            if (checkerForEven % 2 == 0) { //check if even
                summed += checkerForEven; //new int equals and adds itself as the even numbers
            }
        }
        System.out.println(summed);
    }

    //6.
    public static void volumeOfCubeCalculatorInInches(long length, long height, long width){
        long calculation = (length*height*width);
        System.out.println("The volume of this cube is: " + calculation + " Inches ^3");
    }
    //7.
    public static void characterInStringCounter(String wordToCountCharacterFrom){
        int characterCountedAmount = 0; //this is our counter
        //for(int increment = 0; increment < wordToCountCharacterFrom.length(); increment++){
           long counter = wordToCountCharacterFrom.chars().filter(ch -> ch == 's').count(); //not for future reference:ch -> ch == 's'... ch is shorthand for charcter and -> is saying ch is the parameter being set and ch == is the rules set in place!
        System.out.println(counter);
        //}
    }

    //8.
    public static void checkIfStringIsPalindrome(String wordToBeCheckedForPalindrome){
        boolean isPalindrome = false;
        String reconstructToCheckForPalindrome = "";
        for(int i = 0; i < wordToBeCheckedForPalindrome.length(); i++) {
            reconstructToCheckForPalindrome = wordToBeCheckedForPalindrome.charAt(i) + reconstructToCheckForPalindrome;
        }
        if(reconstructToCheckForPalindrome == wordToBeCheckedForPalindrome){
            isPalindrome = true;
        }
    }

    //9.
    public static boolean checkIfYearIsLeapYear(int year){
        int[] leapYears = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048};
        for(int x : leapYears){ //for each number in array
            if(year == x){ //if x = year than one matches in the array
               return true;
            }
        }
        return false; //if nothing matches it is false
    }

    //10.
    public static void scanningForTravel(){
        Scanner scanner = new Scanner(System.in);
        int ticketNumber = 0;

        while(ticketNumber <= 0) {
            try {
                System.out.println("Hello! Ticket number please!");
                ticketNumber = scanner.nextInt();
                if (ticketNumber <= 0) {
                    System.out.println("Please enter a valid ticket number!");
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid ticket number");
                scanner.nextLine();
            }
        }
        System.out.println("Where is your Desitination?");
        String destination = scanner.next();
        System.out.println("Now serving customer number " + ticketNumber + ". Enjoy your trip to " + destination);
    }
    public static void main(String[] args) {

        int[] ArrayInts = {1, 2, 3, 4};

        printALlOddNumbers(); //Invoke 1.
        returnsTheSum(ArrayInts); //Invoke 2.
        returnsTheAverage(ArrayInts); //Invoke 3.
        randomNumberGenerator(); //Invoke 4.
        sumOfAllEvenNumbers(ArrayInts); //Invoke 5.
        volumeOfCubeCalculatorInInches(2, 4, 7); //Invoke 6.
        characterInStringCounter("mississippi"); //Invoke 7.
        checkIfStringIsPalindrome("sus"); //Invoke 8.
        checkIfYearIsLeapYear(2000); //Invoke 9.
        scanningForTravel();
    }
}
