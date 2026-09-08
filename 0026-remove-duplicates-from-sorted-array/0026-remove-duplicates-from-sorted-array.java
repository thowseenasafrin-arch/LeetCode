class Solution {
    public int removeDuplicates(int[] nums) {
     int size=0;
    int[]temp=new int[nums.length];
    for(int i=0;i<nums.length;i++) {
       boolean found=false;
       for(int j=0;j<size;j++){
        if(nums[i]==temp[j]){
            found=true;
            break;

        }
       }
       if(!found){
        temp[size]=nums[i];
        size++;
       }
    }  
    for(int i=0;i<size;i++)  {
        nums[i]=temp[i];
    }
    return size; 
    }
}