import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1.Write a program that checks the role of the user

        System.out.println("Enter your role");
        String role = input.nextLine();

        if (role.equalsIgnoreCase("admin")){
            System.out.println("Welcome Admin");
        } else if (role.equalsIgnoreCase("superuser")){
            System.out.println("Welcome Superuser");
        } else {
            System.out.println("Welcome user");
        }


        //==============================================================

        //2.Take three numbers from the user and print the greatest number.
        //Test Data

        System.out.println("Please, Enter 3 numbers: ");
        int number1 = input.nextInt();
        input.nextLine();
        int number2 = input.nextInt();
        input.nextLine();
        int number3 = input.nextInt();
        input.nextLine();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The gratest: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The gratest: " + number2);
        } else {
            System.out.println("The greatest: " + number3);
        }

        //=======================================================

        //3.Write a Java program that generates an integer between 1 and 7
        //and displays the name of the weekday.

        Random r = new Random();
        // to make the range between 1 and 7
        int random = r.nextInt(7) + 1;
         switch (random) {
             case 1:
                 System.out.println("Sunday");
                 break;
             case 2:
                 System.out.println("Monday");
                 break;
             case 3:
                 System.out.println("Tuesday");
                 break;
             case 4:
                 System.out.println("Wednesday");
                 break;
             case 5:
                 System.out.println("Thursday");
                 break;
             case 6:
                 System.out.println("Friday");
                 break;
             case 7:
                 System.out.println("Saturday");
                 break;
         }


        //===============================================================

        //4.
        //Write a program that takes a numeric score as input and prints
        //the corresponding letter grade using the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69  F:
        //0-59

        System.out.println("Enter your score: ");
        int score = input.nextInt();
        input.nextLine();

        if (score >= 90 && score <= 100) {
            System.out.println("Letter Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Letter Grade: B");
        } else if (score >=70 && score <= 79) {
            System.out.println("Letter Grade: C");
        } else if (score >=60 && score <= 69) {
            System.out.println("Letter Grade: D");
        } else if (score >=0 && score <= 59) {
            System.out.println("Letter Grade: F");
        } else {
            System.out.println("Please enter a score from 0 - 100");
        }

        //==============================================================

        //5.
        //Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.

        System.out.println("Please, Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        if (age < 13) {
            System.out.println("you are a Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager");
        } else {
            System.out.println("you are an Adult");
        }



    }
    //===========================================================

    //Name: Razan Almadan


}