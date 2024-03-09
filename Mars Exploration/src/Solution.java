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
    public static void marsExploration(String message) {
        int wrongCharacter = 0;
        char[] charMessage = message.toCharArray();
        for(int i = 0 ; i <(charMessage.length) ; i+=3){
            if(charMessage[i] != 'S'){
                wrongCharacter++;
                if(charMessage[i+1] != 'O'){
                    wrongCharacter++;
                    if(charMessage[i+2] != 'S'){
                        wrongCharacter++;
                    }
                }
            }
        }
        System.out.println(wrongCharacter);
    }

}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String message = scanner.nextLine();
        Result.marsExploration(message);
    }
}
