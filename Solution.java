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

    public static void plusMinus(List<Integer> arr) {
        
    double divisor = arr.size();  
    double positives = 0;
    double negatives = 0;
    double zeros = 0;
    
    for (int number : arr){
        
        if(number > 0){
            positives += 1;
        }
        else if(number < 0){
            negatives += 1;
        }
        
        else{
            zeros += 1;
        }
    }
    
    DecimalFormat df = new DecimalFormat("0.000000");
    System.out.println(df.format(positives/divisor));
    System.out.println(df.format(negatives/divisor));
    System.out.println(df.format(zeros/divisor));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
