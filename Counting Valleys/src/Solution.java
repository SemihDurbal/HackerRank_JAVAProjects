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

    public static void countingValleys(String[] path , int steps) {
        int valleys = 0;
        int countingValleys = 0;
        for(int i = 0; i < steps ; i++){
            if(path[i].equals("U")){
                valleys++;
            } else if (path[i].equals("D")) {
                valleys--;
            }
            if(valleys > 0 && path[i].equals("U")){
                countingValleys++;
            }
        }

        System.out.println(countingValleys);

    }

}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        int steps = scanner.nextInt();
        scanner.nextLine();
        String[] path = new String[steps];
        for(int i = 0 ; i < steps ; i++){
            path[i] = scanner.nextLine();
        }
        Result.countingValleys(path , steps);
    }
}
