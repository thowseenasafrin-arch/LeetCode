class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> Set=new HashSet<>();
        for(int ind=0; ind<nums.length;ind++)
    {
        if(!Set.add(nums[ind]))
           return true;
    }
    return false;        
    }
} 
    
