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

    public static String twoArrays(int[] A , int[] B ,int n ,int k) {

        for(int i = 0 ; i<n;i++){
            if(A[i] + B[i] < k){
                return "NO";
            }
        }
        return "YES";
    }

}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        for(int i = 0 ; i < q ; i++) {
            //Array Size
            int n = scanner.nextInt();
            //Permuting Number
            int k = scanner.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for(int j = 0 ; j < n ; j++) {
                A[j] = scanner.nextInt();
            }
            for(int j = 0 ; j<n;j++){
                B[j] = scanner.nextInt();
            }
            System.out.println(Result.twoArrays(A,B,n,k));
        }


    }
}
