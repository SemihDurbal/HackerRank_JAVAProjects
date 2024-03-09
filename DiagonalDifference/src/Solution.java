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


    public static void diagonalDifference(int[][] arr , int n) {

        int rightToLeft = 0;
        int leftToRight = 0;
        for(int i = 0 ; i < n ; i++){
            leftToRight+=arr[i][i];
        }

        for(int i = (n-1) ; i >= 0 ; i--){
            rightToLeft+=arr[(n-1)-i][i];
        }

        int sonuc =(leftToRight-rightToLeft);
        if(sonuc < 0){
            sonuc = sonuc*(-1);
        }

        System.out.println(sonuc);
    }


}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int[][]arr = new int[n][n];
        for(int i = 0; i < n ; i++){
            for (int j = 0;j<n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        Result.diagonalDifference(arr , n);

    }
}
