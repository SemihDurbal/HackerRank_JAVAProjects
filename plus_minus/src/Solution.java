import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(int[] arr , double n) {

        double zero = 0;
        double positive = 0;
        double negative = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] > 0){
                positive++;
            }
            if(arr[i] < 0){
                negative++;
            }
            if(arr[i] == 0){
                zero++;
            }
        }

        System.out.println((positive / n));
        System.out.println((negative / n));
        System.out.println((zero / n));

    }

}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        double n = scanner.nextInt();
        int[] arr = new int[(int) n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        Result.plusMinus(arr , n);
    }
}
