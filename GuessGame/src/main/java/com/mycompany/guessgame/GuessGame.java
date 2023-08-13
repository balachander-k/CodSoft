
package com.mycompany.guessgame;


import java.util.*;
public class GuessGame
{
    public static void RandomNumberGenerate()
    {
        System.out.println("Welcome to Number Guess Number & You have only limited attempts");
        System.out.println("So try to guess the number within those attempts");
        Random rand=new Random();
        int num=rand.nextInt(101);
        Guess(num);
    }
    public static void Guess(int randomNumber)
    {
        Scanner obj=new Scanner(System.in);
        int attempts=obj.nextInt();
        
        while(attempts>0)
        {
            System.out.println("Enter Guess a Number between 1 and 100");
            int guess=obj.nextInt();
            while(guess<0 || guess>100)
            {
                System.out.println("Your Guess Number is not within the range. Enter the number between 1 and 100");
                guess=obj.nextInt();
            }
            if(guess==randomNumber)
                System.out.println("You Guessed Correctly! The Number is "+randomNumber);
            else if(guess<randomNumber)
                System.out.println("Your Guess is too low...");
            else 
                System.out.println("Your Guess is too high...");
            attempts--;
        }
        if(attempts==0)
            System.out.println("You lose! The Random Number is "+randomNumber);
        System.out.println("Do You want to play again? (y/n)");
        char choice=obj.next().charAt(0);
        if((choice=='y') || (choice=='Y'))
            RandomNumberGenerate();
        else 
            System.out.println("Thanks for playing");
    }
    public static void main(String[] arg)
    {
        RandomNumberGenerate();
    }
}
