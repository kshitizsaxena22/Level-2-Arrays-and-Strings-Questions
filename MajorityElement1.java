//https://leetcode.com/problems/majority-element/submissions/

import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~
     public static int majorityElement(int[] nums) {
        int val = nums[0];
        int i =0;
        int count =0;
        while(i<nums.length)
        {
            if(nums[i] == val)
            {
                count++;
            }
            else
            {
                if(count>0)
                {
                    count--;
                }
                else
                {
                    val = nums[i];
                    count = 1;
                }
            }
                
            i++;
        }
        return val;
    }

    public static void printMajorityElement(int[] arr) {
        int majElement = majorityElement(arr);
        int count = 0;
        for(int val : arr)
        {
            if(val == majElement)
            {
                count++;
            }
        }
        
        if(count > arr.length/2)
        {
            System.out.println(majElement);
        }
        else
        {
            System.out.println("No Majority Element exist");
        }
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        printMajorityElement(arr);
    }
}