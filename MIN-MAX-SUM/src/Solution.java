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

    public static void miniMaxSum(List<Integer> arr) {

//       int temp = 0;
//       for(int i = 0; i < (arr.size() - 1) ; i++){
//           if(arr.get(i) > arr.get(i+1)){
//               temp = arr.get(i);
//               arr.add(i,arr.get(i+1));
//               arr.add((i+1),temp);
//           }
//       }
        Collections.sort(arr);

        long max = 0;
        long min = 0;

        for(int i = 1 ; i < arr.size() ; i++){
            max += arr.get(i);
        }
        for(int i = 0 ; i < (arr.size() - 1) ; i++){
            min += arr.get(i);
        }

        System.out.print(min + " " + max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
