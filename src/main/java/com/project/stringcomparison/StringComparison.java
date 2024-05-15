/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.stringcomparison;

import java.util.Scanner;
/**
 *
 * This program demonstrates a case insensitive string comparison
 */
public class StringComparison {

    public static void main(String[] args) {
       String input;
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Guess the secret word");
       System.out.println("Hint: P_ _ _ _ _ _ _D");
       
       input = keyboard.next();
       
      if(input.equalsIgnoreCase("PASSWORD"))
              {
                  System.out.println("You guessed the secret word");
              }
      else
      {
          System.out.println("Your answer is wrong. Try again");
      }
    }
}
