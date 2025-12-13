package WIX1002_VIVA_2;

import java.util.Scanner;

public class Q6 {

    
    public static boolean isMirror(int[] a, int[] b) {

        int[] aRev = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            aRev[i] = a[a.length-1-i];
        }

        if (aRev.length != b.length) {
            return false;
        }

        for (int i = 0; i < aRev.length; i++) {
            if (aRev[i] != b[i]) {
                return false;
            }
        }

        return true;
        
    }
    
    /*public static boolean isMirror(int[] a, int[] b) {

        // Convert arrays A and array B to strings
        String aStr = "";
        String bStr = "";

        for (int i = 0; i < a.length;i++) {
            aStr += a[i];
            bStr += b[i];
        }
        
        // Reverse string aStr and compare with bStr
        // Introducing StringBuilder for reversing the string
        // since String is immutable in Java
        // so we cannot reverse it directly
        // StringBuilder provides a mutable sequence of characters
        // and has a reverse() method to reverse the sequence
        // Finally convert it back to String using toString() method

        String aRev = new StringBuilder(aStr).reverse().toString();
        return aRev.equals(bStr);
    }
    */
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter(",|\\s+");

        System.out.print("Array A: ");

        int [] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Array B: ");
        int [] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Mirror Pattern: " + isMirror(a,b));
    }
}