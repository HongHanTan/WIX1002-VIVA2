/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2_q2;

/**
 *
 * @author tehjiajie
 * Question 2: Balanced Parentheses Checker 
 * Check whether a given string of parentheses is balanced.  
 * Implement a method boolean isBalanced(String s) that returns true if every opening parenthesis has a matching closing one. 
 * The string may contain other characters, which should be ignored.Only ( and ) count for checking. 
 * Print “Balanced” or “Not balanced” accordingly
 */
import java.util.*;
public class Viva2_q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter expression: ");
        String s = sc.next();
        if(isBalanced(s))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
        
    }
    
    public static boolean isBalanced(String s) {
        int count_open = 0, count_close = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='(')
                count_open++;
            else if(s.charAt(i)==')')
                count_close++;
        }
        return count_open==count_close;
        
    }
}
