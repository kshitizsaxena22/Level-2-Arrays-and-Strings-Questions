class Solution {
    public List<Integer> partitionLabels(String s) {
        // Make a hashmap that contains the last occurance of each character
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,i);        
        }
        
        List<Integer> li = new ArrayList<>();
        //make prev and max at 0
        int prev =0; //prev will keep the last index of next chunk
        int max =0;
        for(int i =0 ;i<s.length();i++)
        {
            char ch = s.charAt(i);
            max= Math.max(max, map.get(ch)); // update the max here which seperate the labels
            if(max==i) // wherever max is i there you have to add that index in li idxx = max-prev+1
            {
                li.add(max-prev+1);
                prev = i+1;
            }
        }
        return li;
    }
}