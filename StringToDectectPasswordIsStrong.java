
  // PROGRAM OF STRING TO DECTECT A PASSWORD IS STRONG OR NOT.//
  //---------------------------------------------HACKERRANK QUESTION-----------------------------//

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        char[] input = password.toCharArray();
        int count = 4;
        boolean num = true, l = true, u= true, s = true;

        for(int i=0; i<n; i++){
           if(numbers.indexOf(input[i])>=0 && num){
               count--;
               num = false;
            }
           if(lower_case.indexOf(input[i])>=0 && l){
               count--;
               l = false;
            }
           if(upper_case.indexOf(input[i])>=0 && u){
               count--;
               u = false;
             }
           if(special_characters.indexOf(input[i])>=0 && s){
               count--;
               s = false;
            }
         }
        if(6-n > count)
          return 6-n;
        else
          return count;  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
