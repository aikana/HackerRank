import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum1=0, sum2=0;
        
        for(int i=0; i < num ; i++) {
            for(int j=0; j < num ; j ++) {
                int temp = sc.nextInt();
                if (i == j)
                    sum1 += temp;
                if ( num - i -1 == j)
                    sum2 += temp;
            }
        }
        int result = sum1 > sum2 ? sum1-sum2 : sum2-sum1;
        System.out.println(result);
    }
}
