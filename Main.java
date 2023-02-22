import java.util.Scanner;

class Main {
  

  public static void main(String[] args) {
  //Generate a random number to be guessed
                 int  number = (int)(Math.random()*101);

                 Scanner input  = new Scanner(System.in);

                 System.out.println("This program will let you guess a random number between 0 and 100.\nPlease enter your guess number:");

        int guess = -1;

         while (guess != number){
             //Prompt the user to guess the number


             guess = input.nextInt();

        if (guess == number)
            System.out.println("Congratulations! You found the number! It is : " + number);


         else if (guess > number)
            System.out.println("Your guess to high.\nPlease enter your guess");
         else
        System.out.println("Your guess to low.\nPlease enter your guess");
        }
    }}

     // Write all your code here 
    


    

  
