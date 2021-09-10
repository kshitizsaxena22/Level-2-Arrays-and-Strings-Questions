import java.util.*;
//https://leetcode.com/problems/first-missing-positive/
public class Main {


  //~~~~~~~~~~~~~~~User's Section~~~~~~~~~~~~~~~~~
  
   public static int firstMissingPositive(int[] A) {
        int i = 0;
        while(i < A.length){
            //if the element is negative or if the element is equal to ith position or it is out of range
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
            //if the element is not at ith position then swaqp with the ith value
            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
            //else move i++
            else i++;
        }
        i = 0;
        while(i < A.length && A[i] == i+1) i++;
        return i+1;
    }
    
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

  //~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int res = firstMissingPositive(arr);
    System.out.println(res);
  }
}