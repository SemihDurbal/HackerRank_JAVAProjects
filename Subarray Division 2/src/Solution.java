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
    public static void birthday(int[] s, int n, int b, int m) {


    }
}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int d = scanner.nextInt();
        List<Integer> s = new ArrayList<Integer>();
        int m = scanner.nextInt();

        System.out.println(birthday(s , d , m));

    }
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for(int i=0;i<s.size();i++){
            int sum = 0;
            int barsCount = 0;
            for(int j=i;j<j+m;j++){
                if(j>=s.size() || sum >= d){
                    break;
                }
                barsCount++;
                sum+=s.get(j);
            }
            if(sum == d && barsCount == m){
                count++;
            }
        }
        return count;
    }
}
