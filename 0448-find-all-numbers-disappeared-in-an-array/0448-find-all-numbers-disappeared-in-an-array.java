class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> setDB=new HashSet<>();
     List<Integer> result=new ArrayList<>();
     for(int val: nums)
       setDB.add(val);
     for(int n=1;n<=nums.length;n++)
     {
        if(!setDB.contains(n))
           result.add(n);

     } 
     return result; 
        
    }
}