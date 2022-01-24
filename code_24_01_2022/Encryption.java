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
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
                int len=s.length();
                int sqr=(int) Math.sqrt(len);
                int row,col;
                if(sqr*sqr==len)
                {
                    row=col=sqr;
                }
                else
                {
                    row=sqr+1;
                    col=sqr+1;
                }
                String ans="";
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<len;j+=col)
                    {
                        if(i+j<len)
                        ans+=s.charAt(i+j);
                    }
                    ans+=" ";
                }
                return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
