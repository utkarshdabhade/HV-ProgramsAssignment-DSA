/* Question 4: Java 1D Array (Part 2)
Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 
https://www.hackerrank.com/challenges/java-1d-array/problem */

import java.util.*;

public class Question4 {

    public static boolean canWin(int leap, int[] game) {
        return canWinHelper(0, leap, game);
    }
    
    private static boolean canWinHelper(int currentIndex, int leap, int[] game) {
        if (currentIndex >= game.length) {
            return true;
        }
        if (currentIndex < 0 || game[currentIndex] == 1) {
            return false;
        }

        game[currentIndex] = 1; // Mark the current index as visited

        return canWinHelper(currentIndex + leap, leap, game)
                || canWinHelper(currentIndex + 1, leap, game)
                || canWinHelper(currentIndex - 1, leap, game);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

