class Solution {
    public boolean checkPerfectNumber(int num) {
        int factsum=0;
        for(int div=1;div<=num/2;div++){
            if(num%div==0){
              factsum=factsum+div;
            }
        }
        return factsum==num;
    }
}