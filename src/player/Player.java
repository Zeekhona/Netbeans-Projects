/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package player;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author zikhona.nombangwana
 */
public class Player {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        int[] nums = new int[5];
         for (int i = 0; i < 5; i++)
        { 
        System.out.println("Enter number for player 1 >>");
        int num1 = input.nextInt();
        System.out.println("Enter number for player 2 >>");
        int num2 = input.nextInt();
        System.out.println("Enter number for player 3 >>");
        int num3 = input.nextInt();
        System.out.println("Enter number for player 4 >>");
        int num4 = input.nextInt();
        System.out.println("Enter number for player 5 >>");
        int num5 = input.nextInt();
        }
         input.close();
         for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < nums[i]; j++) 
                System.out.printf("*");

            System.out.println();
        }      
    }
    
}
