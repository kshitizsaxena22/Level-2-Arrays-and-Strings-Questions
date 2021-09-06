import java.util.*;

public class Main {
    
    //~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~
    public static String nextGreaterElement(String str) {
        char [] arr = str.toCharArray();
        int i = arr.length-2;
        //find dip
        while(i>=0 && arr[i]>arr[i+1])
        {
            i--;  //i will be at dip position
        }
        if(i==-1)
        {
            return "-1";
        }
        int k = arr.length-1;
        while(arr[i]>=arr[k])
        {
            k--;
        }
        //swap ith and kth element
        
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        String res = "";
        
        for(int j=0;j<=i;j++)
        {
            res+=arr[j];
        }
        
        // Now add in reverse from i+1 to end
        
        for(int j = arr.length-1;j>i;j--)
        {
            res+=arr[j];
        }
        return res;
        
        
    }

    //~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = scn.next();
        String res = nextGreaterElement(num);

        System.out.println(res);
    }
}