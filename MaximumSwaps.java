class Solution {
    public void swap(char[] A, int i, int j) {
        char temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public int maximumSwap(int num) {
        //convert the number to string nad put them in character array
        char[] arr = Integer.toString(num).toCharArray();
        //maintain the last instance of digit in an array
        int li [] = new int[10];
        for(int i = 0;i<arr.length;i++)
        {
            int digit = arr[i] - '0';
            li[digit] = i;
        }
        //maintain a flag to keep the look that swap happens only once
        boolean flag = false;
        //prepare the position of swapping...look from 9 to that number in decreasing order and the first index which is ahead of i swap that number from that index with i
        for(int i = 0;i<arr.length;i++)
        {
            int digit = arr[i] - '0';
            for(int j = 9;j>digit;j--)
            {
                if(li[j] > i)
                {
                    swap(arr,i,li[j]);
                    flag = true;
                    break;
                }
            }
            if(flag==true)
            {
                break;
            }
        }
        
        //prepare the result
        String str = "";
        for(int i =0 ;i<arr.length;i++)
        {
            str+=arr[i];
        }
        int res = Integer.parseInt(str);
        return res;
    }
}