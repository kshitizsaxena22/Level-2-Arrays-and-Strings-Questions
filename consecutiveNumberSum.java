import java.util.*;
//https://leetcode.com/problems/consecutive-numbers-sum/submissions/
public class Main {

  // ~~~~~~~~~~~User's Section~~~~~~~~~~~~~
  public static int consecutiveNumbersSum(int n) {
    int count =0;
        for(int k =1 ;k * (k-1) < 2*n;k++)
        {
            int numerator = n - (k * (k-1) /2);
            if(numerator % k == 0)
                count++;
        }
        
        return count;
  }

  // ~~~~~~~~~Input Management~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int res = consecutiveNumbersSum(num);
    System.out.println(res);
  }
}