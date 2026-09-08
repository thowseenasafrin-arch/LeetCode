class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> setDB=new HashSet<>();
        for(int val : nums)
          setDB.add(val);
        int max=0,count;  
        for(int val : setDB) 
        {
            if(setDB.contains(val-1))
               continue;
            count=1;
            while(setDB.contains(++val))
               count++;
             
            max=Math.max(max,count);   
        } 
     return max;    
    }
}