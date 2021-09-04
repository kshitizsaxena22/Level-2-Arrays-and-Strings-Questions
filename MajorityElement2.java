

//https://leetcode.com/problems/majority-element-ii/submissions/
import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~
    
    public static boolean checkFreq(int [] arr,int val)
    {
        int count =0 ;
        for(int e:arr)
        {
            if(e==val)
            {
                count++;
            }
        }
        
        return count > arr.length/3;
    }
    public static ArrayList<Integer> majorityElement2(int[] nums) {
        int val1 = nums[0];
        int val2 = nums[0];
        int count1 = 1;//count of occurance of val1 to make triplets
        int count2 = 0;
        
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i] == val1){
                count1++;
            }else if(nums[i] == val2){
                count2++;
            }else{
                if(count1 == 0){
                    val1 = nums[i];
                    count1 = 1;
                    
                }else if(count2==0){
                    val2 = nums[i];
                    count2=1;
                }else{
                    count1--;
                    count2--;
                    
                }
            }
        }
        
        ArrayList<Integer> li  = new ArrayList<>();
        boolean check1 = checkFreq(nums,val1);
        if(check1 == true) li.add(val1);
        if(val1==val2) return li;
        boolean check2 = checkFreq(nums,val2);
        if(check2 == true) li.add(val2);
        return li;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> res = majorityElement2(arr);
        System.out.println(res);
    }
}