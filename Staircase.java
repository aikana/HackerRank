import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i =0, j=0;
        for (int k = 0; k < num ; k++) {
            for (i= num-k-1 ; i > 0 ; i --) {
                System.out.print(" ");
            }
            for (j = k+1; j > 0; j--) {
                    System.out.print("#");
            }
            System.out.println();
        }
        
    }
}
