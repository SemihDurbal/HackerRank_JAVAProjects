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
    public static String pangrams(String s) {
        char[] sChar = s.toCharArray();
        int[] alphabet = new int[25];
        for (int i = 0 ; i < sChar.length ; i++){
            if(sChar[i] == 'A' || sChar[i] == 'a'){
                alphabet[0]=1;
            }
            if(sChar[i] == 'B' || sChar[i] == 'b'){
                alphabet[1]=1;
            }
            if(sChar[i] == 'C' || sChar[i] == 'c'){
                alphabet[2]=1;
            }
            if(sChar[i] == 'D' || sChar[i] == 'd'){
                alphabet[3]=1;
            }
            if(sChar[i] == 'E' || sChar[i] == 'e'){
                alphabet[4]=1;
            }
            if(sChar[i] == 'F' || sChar[i] == 'f'){
                alphabet[5]=1;
            }
            if(sChar[i] == 'G' || sChar[i] == 'g'){
                alphabet[6]=1;
            }
            if(sChar[i] == 'H' || sChar[i] == 'h'){
                alphabet[7]=1;
            }
            if(sChar[i] == 'I' || sChar[i] == 'i'){
                alphabet[8]=1;
            }
            if(sChar[i] == 'J' || sChar[i] == 'j'){
                alphabet[9]=1;
            }
            if(sChar[i] == 'K' || sChar[i] == 'k'){
                alphabet[10]=1;
            }
            if(sChar[i] == 'L' || sChar[i] == 'l'){
                alphabet[11]=1;
            }
            if(sChar[i] == 'M' || sChar[i] == 'm'){
                alphabet[12]=1;
            }
            if(sChar[i] == 'N' || sChar[i] == 'n'){
                alphabet[13]=1;
            }
            if(sChar[i] == 'O' || sChar[i] == 'o'){
                alphabet[14]=1;
            }
            if(sChar[i] == 'P' || sChar[i] == 'p'){
                alphabet[15]=1;
            }
            if(sChar[i] == 'R' || sChar[i] == 'r'){
                alphabet[16]=1;
            }
            if(sChar[i] == 'S' || sChar[i] == 's'){
                alphabet[17]=1;
            }
            if(sChar[i] == 'T' || sChar[i] == 't'){
                alphabet[18]=1;
            }
            if(sChar[i] == 'U' || sChar[i] == 'u'){
                alphabet[19]=1;
            }
            if(sChar[i] == 'V' || sChar[i] == 'v'){
                alphabet[20]=1;
            }
            if(sChar[i] == 'Y' || sChar[i] == 'y'){
                alphabet[21]=1;
            }
            if(sChar[i] == 'Z' || sChar[i] == 'z'){
                alphabet[22]=1;
            }
            if(sChar[i] == 'W' || sChar[i] == 'w'){
                alphabet[23]=1;
            }
            if(sChar[i] == 'X' || sChar[i] == 'x'){
                alphabet[24]=1;
            }
        }
        System.out.println(Arrays.toString(alphabet));
        for (int j = 0; j < alphabet.length ; j++){
            if(alphabet[j] == 0){
                return "notPangram";
            }
        }
        return "pangrams";
    }

}

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();
        System.out.println(Result.pangrams(s));
    }
}
