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
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int[] arr , int k , int n) {
        int sonuc = 0;
        for (int i = 0 ; i < n-1 ; i++){
            for (int j = i+1; j < n; j++){
                if((arr[i] + arr[j]) % k == 0){
                    sonuc++;
                }
            }
        }
        return sonuc;
    }
}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int k = scanner.nextInt();

        for(int i = 0; i< n ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(Result.divisibleSumPairs(arr , k , n));

    }
}
