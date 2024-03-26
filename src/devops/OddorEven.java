/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devops;

import java.util.Scanner;

/**
 *
 * @author Kami
 */
public class OddorEven {
    static Scanner s = new Scanner(System.in);
    
    static void checkOddorEven(){
            int input;
           
            System.out.println("Enter a number: ");
            input  = s.nextInt();
            
            if(input % 2 == 0){
                System.out.println("The number entered is an Even Number");
            }else{
                System.out.println("The number entered is an Odd Number");
            }
    }
    
    static void exit(){
            System.out.println("Closing the App");
            System.exit(0);
    }
            
     public static void main(String[] args) {
         System.out.println("Main Menu");
         System.out.println("Please select an option below");
         
         System.out.println("1. Check Odd or Even");
         System.out.println("2. Exit");
         
         int option = s.nextInt();
         switch(option){
             case 1:
                 checkOddorEven();
                 break;
             case 2:
                 exit();
                 break;
                 
             default:
                 System.out.println("Invalid option selected");
         }
         
    }
    
}
