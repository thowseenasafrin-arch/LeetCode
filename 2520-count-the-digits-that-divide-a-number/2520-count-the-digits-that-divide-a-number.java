class Solution {
    public int countDigits(int num) {
        int digit,count=0;
        int sum=num;
        while(num!=0){
            digit=num%10;           
            if(sum%digit==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}