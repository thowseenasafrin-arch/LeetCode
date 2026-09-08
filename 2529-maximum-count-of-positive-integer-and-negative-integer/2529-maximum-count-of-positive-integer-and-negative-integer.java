class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int val:nums){
            if (val>0)
                pos++;
            else if(val<0)
                neg++;
        }
        if(pos>neg){
            return pos;
        }else{
            return neg;
        }        
    }
}