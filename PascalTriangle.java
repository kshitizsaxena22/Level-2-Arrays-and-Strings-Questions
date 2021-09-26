class Solution {
    public List<Integer> getRow(int i) {
        List<Integer> res = new ArrayList<>();
        long val = 1;  //nc0 is always 1
        for(int j = 0;j<=i;j++)
        {   
            res.add((int)val);
            val = val * (i-j) / (j+1); 
        }
        return res;
    }
}