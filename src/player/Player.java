/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package player;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author zikhona.nombangwana
 */
public class Player {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number player >> " + i + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("Numbers in asterisk");

        for (int num : numbers) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

