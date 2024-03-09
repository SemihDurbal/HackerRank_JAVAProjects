import java.io.*;
import java.math.*;
import java.security.*;
import java.sql.SQLOutput;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {



    public static void breakingRecords(List<Integer> scores , int n) {
        System.out.println("                                Count");
        System.out.println("Game  " + "Score  " + "Minimum  " + "Maximum  " + "Min Max");
        int game = 0;
        int score = 0;
        int Minimum = 2147483647;
        int Maximum = 0;
        int min = 0;
        int max = 0;

        for(int i = 0; i < n ; i++){
            game = i;
            score = scores.get(i);
            if(scores.get(i) < Minimum){
                int temp = Minimum;
                Minimum = scores.get(i);
                if(Minimum < temp){
                    min++;
                }
            }
            if(scores.get(i) > Maximum){
                int temp = Maximum;
                Maximum = scores.get(i);
                if(Maximum > temp){
                    max++;
                }
            }
            System.out.println(game + "      " + score +  "      " + Minimum +  "      " + Maximum +  "      " + min + "   " + max);
        }


    }

}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        List<Integer> scores = new ArrayList<Integer>();

        int n = scanner.nextInt();

        for(int i = 0;i<n ;i++){
            scores.add(scanner.nextInt());
        }

        Result.breakingRecords(scores , n);


    }
}
