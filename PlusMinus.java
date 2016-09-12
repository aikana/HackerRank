import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = 0, temp=0;
        num = sc.nextInt();
        int pos, neg, zero;
        pos = neg = zero = 0;
        
        for (int i=0; i < num ; i ++ ) {
            temp = sc.nextInt();
            if (temp > 0)
                pos ++;
            else if (temp < 0)
                neg ++;
            else
                zero ++;
        }
        System.out.printf("%.6f\n", (float)pos/(pos+neg+zero));
        System.out.printf("%.6f\n", (float)neg/(pos+neg+zero));
        System.out.printf("%.6f", (float)zero/(pos+neg+zero));
        
    }
}
