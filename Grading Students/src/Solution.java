import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {
    public static void gradingStudents(int[] grades , int n) {

        for(int i = 0 ; i < n ; i++){
            if(grades[i] > 40){
                if((grades[i] % 5) > 3){
                    int a = grades[i] % 5;
                    grades[i] = grades[i] + a;
                }
            }
        }
    }

}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int[] grades = new int[n];
        for(int i = 0 ; i < n ; i++){
            grades[i] = scanner.nextInt();
        }
        Result.gradingStudents(grades , n);
    }
}
