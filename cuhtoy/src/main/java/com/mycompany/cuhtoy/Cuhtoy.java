/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuhtoy;
import java.util.Stack;
import java.util.*;
/**
 *
 * @author HPuser
 */
public class Cuhtoy {

    public static void main(String[] args) {
        Stack<String> wiw = new Stack<>();
        Scanner scan = new Scanner(System.in);
        String wordo = "";
        boolean run = true;
        
        System.out.println("<Enter word by word to form a sentence>");
        while(run){
            System.out.print("Enter word (type 'q' if done): ");
            wordo = scan.nextLine();

            if(wordo.equals("q")) {
                run = false;
            } else {
                wiw.push(wordo); 
            }
        }   

        System.out.print("Words Entered: ");
        for (String w : wiw) {
            System.out.print(w + " ");
        }
        System.out.println();

        System.out.print("Reversed Sentence: ");
        while(!wiw.isEmpty()){
            System.out.print(wiw.pop() + " ");
        }
    }
}
