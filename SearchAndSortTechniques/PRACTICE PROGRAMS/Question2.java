/* Question 2: Java 2D Array
Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 
https://www.hackerrank.com/challenges/java-2d-array/problem 
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Question2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int result = hourGlassAddition(arr);
        System.out.println(result);
    }
        
         public static int hourGlassAddition(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize the maximum sum with the smallest possible integer value

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int currentSum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                                + arr.get(i+1).get(j+1)
                                + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                maxSum = Math.max(maxSum, currentSum); // Update maximum sum if current sum is larger
            }
        }

        return maxSum;
         }
    } 
        

