package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    //3. Length of string
    //https://www.guru99.com/string-length-method-java.html
//    public static void main(String[] args) {
//        String list1 = "Past";
//        String list2 = "Present";
//        String list3 = "Future";
//
//        int length = list1.length();
//        System.out.println("Length of String list 1 is: " + length);
//        System.out.println("Length of String list 2 is : " + list2.length());
//        System.out.println("Length of String list 3 is : " + list3.length());
//
//    }
//    public static void Length () {
//        return;
//    }
//}

    //4. Get the average of 3 numbers

//    Code using Method; https://www.programiz.com/java-programming/methods

//    public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter 1st number: ");
//            double x = input.nextDouble();
//
//            System.out.println("Enter 2nd number: ");
//            double y = input.nextDouble();
//
//            System.out.println("Enter 3rd number: ");
//            double z = input.nextDouble();
//
//            double average;
//            System.out.println("The average value is " + average(x, y, z) + "\n");
//        }
//
//        public static double average ( double x, double y, double z){
//            return (x + y + z) / 3;
//        }
//
//    }

    //Usual way to find code
//        Scanner input = new Scanner(System.in);
//        int sum = 0;
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Enter a number");
//            int num = input.nextInt();
//
//            sum += num;
//        }
//        System.out.println(sum);
//        System.out.println("Average: " + sum / 3);


    //2. String of letters using Method
//
//    public static void main(String[] args) {
//
//        ArrayList<String> letters = getStrings();
//        //Statement to sort
//        Collections.sort(letters);
//        //Sorted List
//        System.out.println("After Sorting");
//        for (String s: letters) {
//            System.out.println(s);
//        }
//    }
//
//    private static ArrayList<String> getStrings() {
//        ArrayList<String> letters = new ArrayList<>();
//        Scanner input = new Scanner (System.in);
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Enter any letter");
//            String letter = input.nextLine();
//
//            letters.add(letter);
//        }
//        return letters;
//    }
//
//}

    //5. Check if year is a leap year( A leap year is divisible by 4)

//    public static void main(String[] args) {
//
//       leapYear();
//    }
//
//    public static void leapYear (){
//        Scanner input = new Scanner (System.in);
//
//        System.out.println("Enter a year");
//        int value = input.nextInt();
//
//        if (value % 4 == 0) {
//            System.out.println("It is a leap year");
//        } else {
//            System.out.println("It is not a leap year");      //since the data type is void and there are a lot of sys.out statements it won't allow the return type;
//        }
//    }

    //Or method 2

//    static Scanner input = new Scanner (System.in); //(allows user input for all methods)
//
//    public static void main(String[] args) {
//
//        if (leapYear() % 4 == 0) {
//            System.out.println("It is a leap year");
//        } else {
//            System.out.println("It is not a leap year");
//        }
//    }
//
//    public static int leapYear () {
//        System.out.println("Enter a year: ");
//        int year = input.nextInt();
//        return year;      //prompts for a boolean return user input!
//    }


    //Or method 3
//    public static void main(String[] args) {
//
//       leapYear(2022);  //passing an int
//    }
//
//    public static void leapYear (int year){
//        Scanner input = new Scanner (System.in);
//
//        if (year % 4 == 0) {
//            System.out.println("It is a leap year");
//        } else {
//            System.out.println("It is not a leap year");
//        }
//    }}

//https://www.geeksforgeeks.org/collections-sort-java-examples/
//https://www.java-examples.com/determine-if-year-leap-year-java-example
//https://www.programiz.com/java-programming/methods


    //6.
//    public static void main(String[] args) {
//        words();
//    }
//
//    public static void words() {
//        String phrase = "The dog jumped over a fence";
//        String[] Phrase = phrase.split(" ");
//
//            System.out.println(Phrase.length);
//        }
//    }

//https://stackoverflow.com/questions/8924599/how-to-count-the-exact-number-of-words-in-a-string-that-has-empty-spaces-between
//Not needed--> for (int index = 1; index <= Phrase.length; index++) {

    //7. Take 2 integer inputs from the user, and compute its area
//    public static void main(String[] args) {
//        areaCalc();
//    }
//
//    public static void areaCalc() {
//        Scanner input = new Scanner(System.in);
//
//        for (int i = 1; i <= 2; i++) {
//            System.out.println("Enter any number");
//            double x = input.nextInt();
//            double area = x * x;
//            System.out.println("The area is : " + area);
//        }
//    }
    //https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/

    //8. Print 5 random numbers given a bound
    int num = 0;
    static Random rand = new Random();

    public static void main(String[] args) {
        int num = rand.nextInt(20);
        for (int i = 1; i <= num; i++) {
            System.out.println("Random five numbers are :" + num);
        }
    }
}