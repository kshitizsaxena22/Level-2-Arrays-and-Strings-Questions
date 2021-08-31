//https://leetcode.com/problems/container-with-most-water/
import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static int mostWater(int[] height) {
        // write your code here
        int maxWater = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j)
        {
            int l = j-i;
            int h = Math.min(height[i],height[j]);
            int water = l * h;
            maxWater = Math.max(maxWater,water);
            if(height[i]<height[j]) // if height of i is less than j than we have to move i ahead
            {
                i++;
            }
            else{
                j--;
            }
            
        }
        return maxWater;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }

        int res = mostWater(heights);
        System.out.println(res);
    }
}