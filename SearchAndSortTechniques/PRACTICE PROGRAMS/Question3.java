/*
    Question 3: Java Subarray
    Skill Mapping: Basic
    Description: Solve the HackerRank Problem given as a link below - 
    https://www.hackerrank.com/challenges/java-negative-subarray/problem */
    
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;
    import java.util.Scanner;
    
// Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */



public class Question3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
    
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
    
            int count = 0;
    
            for (int start = 0; start < n; start++) {
                for (int end = start; end < n; end++) {
                    int subarraySum = 0;
                    for (int i = start; i <= end; i++) {
                        subarraySum += arr[i];
                    }
                    if (subarraySum < 0) {
                        count++;
                    }
                }
            }
    
            System.out.println(count);
        }
    
        }
    
    
        

