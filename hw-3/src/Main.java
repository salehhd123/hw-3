import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


//Write a program that prints the numbers from 1 to 100 such that

//        for(int i=1; i<=100; i++){
//
//            if(i % 3 ==0){
//                System.out.println("Fizz");
//            } else if (i % 5 ==0) {
//                System.out.println("Buzz");
//            } else if (i % 5 ==0 &&i % 3 ==0 ) {
//                System.out.println("FizzBuzz");
//            }
//            else System.out.println(i);
//        }

//Write a Java program to reverse a string.
//        String text1 = inp.nextLine();
//        String reversedString = "";
//        for(int i = text1.length()-1; i>=0; i--){
//            reversedString = reversedString + text1.charAt(i);
//        }
//            System.out.println(reversedString);

//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
//        int num1 = inp.nextInt();
//        while(num1>=0){
//            System.out.println(num1*0);
//            System.out.println(num1*1);
//            System.out.println(num1*2);
//            System.out.println(num1*3);
//            System.out.println(num1*4);
//            System.out.println(num1*5);
//            System.out.println(num1*6);
//            System.out.println(num1*7);
//            System.out.println(num1*8);
//            System.out.println(num1*9);
//            System.out.println(num1*10);
//             num1 = inp.nextInt();
//        }

//Write a program to find the factorial value of any number entered through the keyboard.
//        int num1 = inp.nextInt();
//        int res=1;
//        for(int i=1; i<=num1;i++){
//            res *= i;
//        }
//            System.out.println(res);

//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
//        int num1 = inp.nextInt();
//        int num2 = inp.nextInt();
//        int sum = 1;
//        int res = 1;
//            for(int i=0;i<num2;i++){
//                sum = sum * num1;
//            }
//        System.out.println(sum);


// Write a program that reads a set of integers, and then prints the sum of the even and odd integers

//        System.out.println("the program will work until you input negative number !");
//        int num1 = inp.nextInt();
//        int even=0;
//        int odd=0;
//        while (num1>=0){
//            if(num1%2==0){
//                even++;
//            }
//            else {odd++;}
//            num1 = inp.nextInt();
//        }
//        System.out.println("the even :"+even+"the odd :"+odd);

//        Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
//        int num1 = inp.nextInt();
//        int check=0;
//
//        for(int i = 1; i <= num1;i++){
//            if(num1%i==0){
//                check++;
//            }
//        }
//        if(check==2){
//            System.out.println("number is prime");
//        }else System.out.println("is not prime");

//        Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

        ////        int num1 = inp.nextInt();
        ////        int pos=0;
        ////        int zero=0;
        ////        int nig=0;
        ////        while(true){
        ////            if(num1>0){
        ////                pos++;
        ////            } else if (num1<0) {
        ////                nig++;
        ////            }else zero++;
        ////
        ////            System.out.println("you enter hom many zero :"+zero+" positive :"+pos+" negative :"+nig);
        ////            num1 = inp.nextInt();
        ////        }


//.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
//        for(int i=1;i<=4;i++) {
//            System.out.println("week "+i);
//            for(int g=1;g<=7; g++){
//                System.out.println("day "+g);
//            }
//        }


        String text1 = inp.nextLine();
        String reversedString = "";
        for(int i = text1.length()-1; i>=0; i--){
            reversedString = reversedString + text1.charAt(i);
        }
        if(text1.equals(reversedString)){
            System.out.println("it is a palindrome ");
        }else System.out.println("is not a palindrome ");


    }
}